import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Admin admin = new Admin("admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Muchamad Rizky Fanani", "202410370110503");

        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistem Login ===");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Username: ");
                    String inputUser = in.nextLine();
                    System.out.print("Masukkan Password: ");
                    String inputPass = in.nextLine();
                    admin.login(inputUser, inputPass);
                    running = false;
                    break;

                case 2:
                    System.out.print("Masukkan Nama: ");
                    String inputNama = in.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String inputNim = in.nextLine();
                    mahasiswa.login(inputNama, inputNim);
                    running = false;
                    break;

                case 3:
                    System.out.println("Keluar dari sistem...");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        in.close();
    }
}