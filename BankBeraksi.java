
public class BankBeraksi {
    public static void main(String[] args) {
        Person Kharan = new Person("Kharan", "123456", "Sawojajar");
        Person Rayhan = new Person("rayhan", "234567", "Saxophone");
        Person Aldrin = new Person("Aldrin", "3455678", "Suhat");

        Rekening rekA = new Rekening(100000, Kharan);
        rekA.SimpanUang(450000);
        rekA.AmbilUang(300000);
        
        Rekening rekB = new Rekening(50000, Rayhan);
        rekB.SimpanUang(950000);
        rekB.AmbilUang(1000000);

        Rekening rekC = new Rekening(500000, Aldrin);
        rekC.SimpanUang(50000);
        rekC.AmbilUang(6000000);

        double SaldoTotal = 0;
        for(Rekening rek : Rekening.daftar){
            SaldoTotal += rek.getSaldo();
        }
        System.err.println("Total Saldo: " + SaldoTotal + "\n");

        String namaTerbesar = "";
        double SaldoTerbesar = 0.0;
        for(Rekening rek : Rekening.daftar){
            if(rek.getSaldo() > SaldoTerbesar){
                SaldoTerbesar = rek.getSaldo();
                namaTerbesar = rek.getNamaNasabah();
            }
        }
        System.err.println("Saldo Terbesar\nName: " + namaTerbesar);
        System.err.println("Saldo: " + SaldoTerbesar + "\n");
    }
}
