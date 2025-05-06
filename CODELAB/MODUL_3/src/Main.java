
public class Main {
    public static void main(String[] args) {
        Pahlawan Brimstone = new Pahlawan ("Brimstone", 200);
        Musuh Viper = new Musuh ("Viper", 180);

        Senjata Katana = new Senjata ("Katana" , 50);
        Senjata Shotgun = new Senjata ("Shotgun", 60);


        System.out.println("======= Status Awal =======");
        System.out.println(Brimstone.getNama() + " memiliki kesehatan : " + Brimstone.getKesehatan());
        System.out.println(Viper.getNama() + " memiliki kesehatan : " + Viper.getKesehatan());
        System.out.println();

        Brimstone.PilihanSenjata(Katana);
        Viper.PilihanSenjata(Shotgun);

        Brimstone.serang(Viper);
        Viper.serang(Brimstone);

        System.out.println();
        System.out.println("======= Status Akhir =======");
        System.out.println(Brimstone.getNama() + " memiliki kesehatan : " + Brimstone.getKesehatan());
        System.out.println(Viper.getNama() + " memiliki kesehatan : " + Viper.getKesehatan());


    }


}