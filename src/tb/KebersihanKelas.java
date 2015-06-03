package tb;
import java.io.FileWriter;
import java.util.Scanner;

public class KebersihanKelas extends KelasUtama {
    Scanner input = new Scanner(System.in);    
    private String SirkulasiUdara;
    private int Pencahayaan;
    private int Kelembapan;
    private int SuhuCel;

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getPencahayaan() {
        return Pencahayaan;
    }

    public void setPencahayaan(int Pencahayaan) {
        this.Pencahayaan = Pencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhuCel() {
        return SuhuCel;
    }

    public void setSuhuCel(int SuhuCel) {
        this.SuhuCel = SuhuCel;
    }
    

    @Override
    void Input() {
        System.out.println("Sirkulasi Udara : ");
        String SirkulasiUdara = input.next();
        System.out.println("Pencahayaan : ");
        int Pencahayaan = input.nextInt();
        System.out.println("Kelembapan : ");
        int Kelembapan = input.nextInt();
        System.out.println("Suhu(Celcius) : ");
        int SuhuCel = input.nextInt();
    }

    @Override
    void View() {
        System.out.println("Sirkulasi Udara : "+SirkulasiUdara);
        System.out.println("Pencahayaan : "+Pencahayaan);
        System.out.println("Kelembapan : "+Kelembapan);
        System.out.println("Suhu(Celcius) : "+SuhuCel);
    }

    @Override
    void Analisa() {
        if(SirkulasiUdara.equals("Lancar")){
            System.out.print("SESUAI!");
	}
	else{
            System.out.println("TIDAK SESUAI!");
	}
	if(Pencahayaan >= 250 && Pencahayaan <= 300 ){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
	if(Kelembapan >=70 && Kelembapan <=80){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
	if(SuhuCel >=25 && SuhuCel <= 35){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
    }
    
    public void Save(){
    try {
        FileWriter set = new FileWriter("Simpan.txt");
            set.write("Sirkulasi Udara : "+SirkulasiUdara);
            set.write("Pencahayaan : "+Pencahayaan);
            set.write("Kelembapan : "+Kelembapan);
            set.write("SuhuCel : "+SuhuCel);
            set.close();
    }
    catch (Exception a){
        a.printStackTrace();
    }    
}
}