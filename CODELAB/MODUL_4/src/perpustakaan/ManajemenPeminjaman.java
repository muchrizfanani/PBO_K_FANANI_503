package perpustakaan;

public interface ManajemenPeminjaman extends Peminjaman {
    boolean verifikasiPeminjaman(String judul);
    int dendaKeterlambatan(int hariTerlambat);
}