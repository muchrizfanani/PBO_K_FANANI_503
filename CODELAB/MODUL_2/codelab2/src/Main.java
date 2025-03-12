//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank();
        RekeningBank rek2 = new RekeningBank();

        rek1.nomorR = "202410370110503";
        rek1.namaP = "zhulfikar";
        rek1.saldo = 2000000;

        rek2.nomorR = "202410370110509";
        rek2.namaP = "wahyu";
        rek2.saldo = 500000;

        rek1.tampilkanInfo();
        rek2.tampilkanInfo();

        rek1.setorUang(200000);
        rek2.setorUang(100000);
        System.out.println();

        rek1.tarikTunai(100000);
        rek2.tarikTunai(1000000);

        }
    }