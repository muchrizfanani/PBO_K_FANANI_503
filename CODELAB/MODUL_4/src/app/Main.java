package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {

        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println("\n\n");


        Anggota anggota1 = new Anggota("Sigit Novriyanto", "K500");
        Anggota anggota2 = new Anggota("Muchamad Rizky Fanani", "K503");

        anggota1.cetakInfo();
        anggota2.cetakInfo();
        System.out.println("\n\n");


        anggota1.pinjamBuku("Madilog");
        anggota1.kembalikanBuku("Madilog");
        anggota1.dendaKeterlambatan(0);

        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
        anggota2.dendaKeterlambatan(3);


    }
}