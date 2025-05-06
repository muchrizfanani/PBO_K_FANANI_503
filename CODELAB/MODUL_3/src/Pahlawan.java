public class Pahlawan extends KarakterGame{
    private Senjata senjata;
    public Pahlawan (String nama,int kesehatan){
        super(nama,kesehatan);
    }

    public void PilihanSenjata(Senjata senjata) {
        this.senjata = senjata;
        System.out.println(getNama() + " memilih senjata " + senjata.getNama());

    }

    //public void attack (KarakterGame target){
    // serang(target,senjata);

    // }

    @Override
    public void serang(KarakterGame target ){
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan " + senjata.getNama());
        target.SetKesehatan(target.getKesehatan() - senjata.getDamage());
        System.out.println(target.getNama() + " memiliki kesehatan " + target.getKesehatan());
    }

}