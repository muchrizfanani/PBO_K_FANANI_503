public class User {
    private String nama;
    private String nim;
    private String username;
    private String password;

    public User(String nama, String nim, String username, String password) {
        this.nama = nama;
        this.nim = nim;
        this.username = username;
        this.password = password;
    }

    public void setNama() {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setUsernama(){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void login(String input1, String input2) {
        System.out.println("Login dari user generic");
    }

    public void displayInfo() {
        System.out.println("Informasi user generic");
    }
}