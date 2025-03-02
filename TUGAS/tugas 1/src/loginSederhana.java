import java.util.Scanner;
public class loginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean login = false;

        while(!login){
            System.out.println("Pilih login: ");
            System.out.println("1.Admin  \n2.Mahasiswa");
            System.out.print("pilih tipe login : ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1 ) {
                login = adminlogin (input);
            }else if (pilihan == 2){
                login = studentLogin (input);
            }
        }
    }

    public static boolean adminlogin(Scanner input){
        System.out.print("masukkan Username : ");
        String admin = input.nextLine();
        System.out.print("masukkan Password : ");
        String password = input.nextLine();

        if(admin.equals("admin") && password.equals("admin123")){
            System.out.println("Anda berhasil login");
            return true;
        }else{
            System.out.println("Login gagal! Username  atau Password salah.");
            return false;
        }
    }

    public static boolean studentLogin (Scanner input){
        System.out.print("Masukkan Nama : ");
        String namaSiswa = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String NIM = input.nextLine();

        if(namaSiswa.equals("Muchamad Rizky Fanani") && NIM.equals("202410370110503")){
            System.out.println("Anda berhasil login");
            return true;
        }else{
            System.out.println("Login gagal! Nama atau NIM salah.");
            return false;
        }
    }

    }
