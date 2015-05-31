package tb;
import java.util.Scanner;

public class LingkunganKelas extends TB{
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    
        public void LingkunganRuangKelas(){
        System.out.println("Kondisi Lantai : ");
        String KondisiLantai = input.next();
        kelas.setKondisiLantai(KondisiLantai);
        System.out.println("Kondisi Dinding : ");
        String KondisiDinding = input.next();
        kelas.setKondisiDinding(KondisiDinding);
        System.out.println("Kondisi Atap : ");
        String KondisiAtap = input.next();
        kelas.setKondisiAtap(KondisiAtap);
        System.out.println("Kondisi Pintu : ");
        String KondisiPintu = input.next();
        kelas.setKondisiPintu(KondisiPintu);
        System.out.println("Kondisi Jendela : ");
        String KondisiJendela = input.next();
        kelas.setKondisiJendela(KondisiJendela);

    if(kelas.getKondisiLantai().equals("Bersih") && kelas.getKondisiDinding() 
        .equals("Bersih") && kelas.getKondisiAtap().equals("Bersih") && kelas.getKondisiAtap()
        .equals("Bersih") && kelas.getKondisiPintu().equals("Bersih") && kelas.getKondisiJendela().equals("Bersih")) {
        return; 
    }
        else {}}
    
    public void LingkuangKelas(String KondisiLantai,String KondisiDinding,String KondisiAtap,String KondisiPintu,String KondisiJendela){
        this.KondisiLantai=KondisiLantai;
        this.KondisiDinding=KondisiDinding;
        this.KondisiAtap=KondisiAtap;
        this.KondisiPintu=KondisiPintu;
        this.KondisiJendela=KondisiJendela; 
    
    }
   LingkunganKelas(){
        super.getKondisiLantai();
        super.getKondisiDinding();
        super.getKondisiAtap();
        super.getKondisiPintu();
        super.getJumlahJendela();
    }
    }    

    
    
        

