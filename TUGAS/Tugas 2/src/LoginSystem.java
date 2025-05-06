import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        Scanner in = new Scanner(System.in);
        boolean login = true;

        while (login) {
            System.out.println("Pilih login: ");
            System.out.println("1. Admin  \n2. Mahasiswa \n3. Keluar");
            System.out.print("Pilih tipe login: ");
            int pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Username: ");
                    admin.username = in.nextLine();
                    System.out.print("Masukkan Password: ");
                    admin.password = in.nextLine();
                    admin.Login();
                    login = false;
                    break;

                case 2:
                    System.out.print("Masukkan Nama: ");
                    mahasiswa.nama = in.nextLine();
                    System.out.print("Masukkan NIM: ");
                    mahasiswa.nim = in.nextLine();
                    mahasiswa.Login();
                    login = false;
                    break;

                case 3:
                    System.out.println("========== Keluar dari program ========== ");
                    login = false;

                default:
                    System.out.println("Pilihan tidak valid , masukkan pilihan yang benar !");
                    break;
            }

        }

        in.close();
    }
}