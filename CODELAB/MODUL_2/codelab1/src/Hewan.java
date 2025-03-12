import java.util.Scanner;

public class Hewan {

    //atribut (data)
    String nama;
    String jenis;
    String suara;
    Scanner ip = new Scanner(System.in); //menggunakan scanner sebagai atribut di class hewan

    //method untuk meminta user untuk menginputkan data menggunakan scanner
    void inputDataHewan(){
        System.out.print("Masukkan Nama : ");
        this.nama = ip.nextLine();
        System.out.print("Masukkan Jenis : ");
        this.nama = ip.nextLine();
        System.out.print("Masukkan Suara : ");
        this.nama = ip.nextLine();
    }
    void tampilkanInfo(){
        System.out.println("Nama = " + nama );
        System.out.println("Jenis = " + jenis );
        System.out.println("Suara = " + suara );
        System.out.println();
    }
}


