public class Mahasiswa {
    String nama, nim;

    public void Login() {
        if (this.nama.equalsIgnoreCase("Muchamad Rizky Fanani") && nim.equals("202410370110503")) {
            System.out.println("Anda berhasil login sebagai Mahasiswa.\n");
            info();
        } else {
            System.out.println("Login gagal! Username atau Password salah.");
        }

    }
    public void info() {
        System.out.println("======= Informasi Login =======");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}