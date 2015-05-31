package tb;
import java.util.Scanner;

public class KebersihanKelas extends TB {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    private String HasilCahaya;
    private String HasilLembab;
    private String HasilSuhu;
    private String hasilSirkulasiUdara;
    
    
    public void KebersihanRuangKelas() {
        System.out.println("Sirkulasi Udara : ");
        String SirkulasiUdara = input.next();
        kelas.setSirkulasiUdara(SirkulasiUdara);
        System.out.println("Pencahayaan : ");
        int Pencahayaan = input.nextInt();
        kelas.setPencahayaan(Pencahayaan);
        System.out.println("Kelembapan : ");
        int Kelembapan = input.nextInt();
        kelas.setKelembapan(Kelembapan);
        System.out.println("Suhu(Celcius) : ");
        int SuhuCel = input.nextInt();
        kelas.setSuhuCel(SuhuCel);  
        
    }

    @Override
    public void setSuhuCel(int SuhuCel) {
        this.SuhuCel=SuhuCel;
        if(SuhuCel >= 25 && SuhuCel <=35){
            HasilSuhu ="Sesuai";
        }else{
            HasilSuhu = "Tidak Sesuai";
        }
        super.setSuhuCel(SuhuCel);
        return;
    }

    @Override
    public void setKelembapan(int Kelembapan) {
        this.Kelembapan=Kelembapan;
        if(Kelembapan >= 70 && Kelembapan<=80){
            HasilLembab ="Sesuai";
        }else{
            HasilLembab = "Tidak Sesuai";
        }
        super.setKelembapan(Kelembapan); 
        return;
    }

    @Override
    public void setPencahayaan(int Pencahayaan) {
        this.Pencahayaan=Pencahayaan;
        if (Pencahayaan >=250 && Pencahayaan <=350){
            HasilCahaya = "Sesuai";
        }else{
            HasilCahaya = "Tidak Sesuai";
        }
        super.setPencahayaan(Pencahayaan);
        return;
    }

    @Override
    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara=SirkulasiUdara;
        if(SirkulasiUdara.equals("Bersih")){
        hasilSirkulasiUdara = "Sesuai";
        }
        else{
            hasilSirkulasiUdara = "Tidak Sesuai";
        }
        super.setSirkulasiUdara(SirkulasiUdara); 
        return;
    }

    
    void setdata(String SirkulasiUdara, int Pencahayaan, int Kelembapan, int SuhuCel) {
        this.SirkulasiUdara=SirkulasiUdara;
        this.Pencahayaan=Pencahayaan;
        this.Kelembapan=Kelembapan;
        this.SuhuCel=SuhuCel;
        super.setdata(SirkulasiUdara, Pencahayaan, Kelembapan, SuhuCel); 
    }
    
    
       
}
