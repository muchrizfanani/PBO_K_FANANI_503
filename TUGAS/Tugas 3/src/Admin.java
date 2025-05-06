public class Admin extends User {

    public Admin(String username, String password) {
        super(null, null, username, password);
    }

    @Override
    public void login(String inputUser, String inputPass) {
        if (getUsername().equals(inputUser) && getPassword().equals(inputPass)) {
            System.out.println("Login berhasil sebagai Admin.");
            displayInfo();
        } else {
            System.out.println("Login Admin gagal! Username atau password salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Info Admin ===");
        System.out.println("Username: " + getUsername());
    }
}