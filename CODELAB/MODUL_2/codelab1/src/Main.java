import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.inputDataHewan(); //memanggil method di class Hewan untuk meminta input dari user dari objek hewan1
        System.out.println();
        hewan2.inputDataHewan(); //memanggil method di class Hewan untuk meminta input dari user dari objek hewan2

        System.out.println("======== Informasi Hewan =======");
        hewan1.tampilkanInfo(); // memanggil method di class hewan untuk menampilkan data dari hewan 1
        hewan2.tampilkanInfo();// memanggil method di class hewan untuk menampilkan data dari hewan 2

        ip.close();

        }
    }