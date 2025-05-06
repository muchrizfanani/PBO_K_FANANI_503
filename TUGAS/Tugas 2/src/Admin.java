public class Admin {
    String username, password;

    public void Login(){
        if(username.equals("admin") && password.equals("admin123")) {
            System.out.println("Anda berhasil login sebagai Admin.");
        } else {
            System.out.println("Login gagal! Username atau Password salah.");
        }

    }

}