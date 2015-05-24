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
        
        if(SirkulasiUdara.equals("Bersih")){
        hasilSirkulasiUdara = "Sesuai";
        }
        else{
            hasilSirkulasiUdara = "Tidak Sesuai";
        }   
        
        System.out.println("Pencahayaan : ");
        int Pencahayaan = input.nextInt();
        kelas.setPencahayaan(Pencahayaan);
        
        if (Pencahayaan >=250 && Pencahayaan <=350){
            HasilCahaya = "Sesuai";
        }else{
            HasilCahaya = "Tidak Sesuai";
        }
        
        System.out.println("Kelembapan : ");
        int Kelembapan = input.nextInt();
        kelas.setKelembapan(Kelembapan);
        
        if(Kelembapan >= 70 && Kelembapan<=80){
            HasilLembab ="Sesuai";
        }else{
            HasilLembab = "Tidak Sesuai";
        }
        
        System.out.println("Suhu(Celcius) : ");
        int SuhuCel = input.nextInt();
        kelas.setSuhuCel(SuhuCel);  
        
        if(Kelembapan >= 25 && Kelembapan <=35){
            HasilSuhu ="Sesuai";
        }else{
            HasilSuhu = "Tidak Sesuai";
        }
            
        super.getSirkulasiUdara();
        super.getPencahayaan();
        super.getKelembapan();
        super.getSuhuCel();
        
    }
    
       
}
