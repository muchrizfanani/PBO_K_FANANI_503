package perpustakaan;

public class Anggota implements ManajemenPeminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void cetakInfo() {
        System.out.println("============================================================");
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
        System.out.println("============================================================");
    }

    @Override
    public void pinjamBuku(String judul) {
        if (verifikasiPeminjaman(judul)) {
            System.out.println(nama + " meminjam buku berjudul: " + judul);
        } else {
            System.out.println("Peminjaman gagal: Buku \"" + judul + "\" tidak tersedia atau tidak valid.");
        }
    }

    @Override
    public void pinjamBuku(String judul, int durasi) {
        if (verifikasiPeminjaman(judul)) {
            System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
        } else {
            System.out.println("Peminjaman gagal: Buku \"" + judul + "\" tidak tersedia atau tidak valid.");
        }
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
    }

    @Override
    public boolean verifikasiPeminjaman(String judul) {
        return judul != null && !judul.isEmpty();
    }

    @Override
    public int dendaKeterlambatan(int hariTerlambat) {
        int dendaPerHari = 2000;
        if (hariTerlambat > 0) {
            int totalDenda = hariTerlambat * dendaPerHari;
            System.out.println("Denda keterlambatan: Rp" + totalDenda);
            return totalDenda;
        } else {
            System.out.println("Tidak ada denda. Buku dikembalikan tepat waktu.");
            return 0;
        }
    }

    public String getIdAnggota() {
        return idAnggota;
    }
}