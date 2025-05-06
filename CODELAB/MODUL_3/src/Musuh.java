public class Musuh extends KarakterGame {
    private Senjata senjata;
    public Musuh (String nama,int kesehatan){
        super(nama,kesehatan);
    }
    public void PilihanSenjata(Senjata senjata) {
        this.senjata = senjata;
        System.out.println(getNama() + " memilih senjata " + senjata.getNama());

    }

    @Override
    public void serang(KarakterGame target ){
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan " + senjata.getNama());
        target.SetKesehatan(target.getKesehatan()- senjata.getDamage());
        System.out.println(target.getNama() + " memiliki kesehatan " + target.getKesehatan());
    }
}