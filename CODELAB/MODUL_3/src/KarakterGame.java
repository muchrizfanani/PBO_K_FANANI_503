public class KarakterGame {
    private String nama ;
    private int kesehatan;

    public KarakterGame(String nama , int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
    }
    public void Setnama(String nama){
        this.nama = nama;
    }
    public void SetKesehatan(int kesehatan){

        this.kesehatan = kesehatan;
    }

    public String getNama(){
        return nama;
    }
    public int getKesehatan(){
        return kesehatan;
    }

    public void serang(KarakterGame target ){
        System.out.println(nama + target.getNama());
        //target.SetKesehatan(target.getKesehatan()- senjata.getDamage());

    }

}