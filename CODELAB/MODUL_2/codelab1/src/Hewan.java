public class Hewan {

    //atribut (data)
    String nama;
    String jenis;
    String suara;
    int jumlah ;

    //constructor
    public Hewan(String nama, String jenis, String suara, int jumlah){
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
        this.jumlah = jumlah;
    }

    //method
    public void tampilkanInfo(){
        System.out.println("Nama = " + nama );
        System.out.println("Jenis = " + jenis );
        System.out.println("Suara = " + suara );
        System.out.println("jumlah = " + jumlah );
        System.out.println();

    }

}
