public class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim, null, null);
    }

    @Override
    public void login(String inputNama, String inputNim) {
        if (getNama().equalsIgnoreCase(inputNama) && getNim().equals(inputNim)) {
            System.out.println("Login berhasil sebagai Mahasiswa.");
            displayInfo();
        } else {
            System.out.println("Login Mahasiswa gagal! Nama atau NIM salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Info Mahasiswa ===");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}