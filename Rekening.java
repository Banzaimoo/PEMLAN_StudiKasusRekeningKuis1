import java.util.ArrayList;

public class Rekening{

    private Person Nasabah;
    private double Saldo;
    private String RekeningID;
    private static int jumlahNasabah = 0;
    static ArrayList<Rekening> daftar = new ArrayList<>();

    Rekening(double S, Person Nasabah){
        this.Nasabah = Nasabah;
        Rekening.jumlahNasabah++;
        this.RekeningID = buatID(Rekening.jumlahNasabah);
        this.Saldo = S;
        daftar.add(this);

        System.err.println("Selamat Datang di bank ABC");
        this.cekSaldo();
    }

    private String buatID(int count){
        String ID;
        if(count < 10){
            ID = "0" + String.valueOf(count);
        }else{
            ID = String.valueOf(count);
        }
        return ("2022-"+ID);
    }

    public void setRekeningID(String ID){
        this.RekeningID = ID;
    }

    public void cekSaldo(){
        System.err.println("No Rekening: " + RekeningID);
        System.err.println("Saldo saat ini: " + Saldo);
        System.err.println("");
    }

    public void AmbilUang(double S){
        if(S > this.Saldo){
            System.err.println("Saldo tidak mencukupi");
            this.cekSaldo();
            return;
        }
        this.Saldo -= S;
        System.err.println("Ambil uang Rp." + S);
        this.cekSaldo();
    }

    public void SimpanUang(double S){
        this.Saldo += S;
        System.err.println("Simpan Uang Rp." + S);
        this.cekSaldo();
    }

    public String getNamaNasabah(){
        return this.Nasabah.Nama;
    }

    public double getSaldo(){
        return this.Saldo;
    }
}