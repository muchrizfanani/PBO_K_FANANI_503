package perpustakaan;

public class NonFiksi extends Buku {
    private String bidang;

    public NonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        System.out.println("============================================================");
        System.out.println("Buku Non-Fiksi: " + judul + "\noleh : " + penulis + "\nBidang: "+ bidang);
        System.out.println("============================================================");
    }
}