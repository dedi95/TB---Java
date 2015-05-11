package tb;
import java.util.Scanner;

public class JKP extends TB {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    JKP data = new JKP();
    
    
    public void JmlhKondisiSarana(){
    System.out.println("Jumlah Stop Kontak : ");
    int JumlahStopKontak = input.nextInt();
    data.setJumlahStopKontak(JumlahStopKontak);    
    System.out.println("Kondisi Stop Kontak : ");
    String KondisiStopKontak = input.next();
    data.setKondisiStopKontak(KondisiStopKontak);
    System.out.println("Posisi Stop Kontak : ");
    String PosisiStopKontak = input.next();
    data.setPosisiStopKontak(PosisiStopKontak);
    
    if (data.getJumlahStopKontak() > 2 && data.getKondisiStopKontak()
        .equals("Bagus") && data.getPosisiStopKontak().equals("Belakang")) {
            return; }
    else {
    }
    
    super.getKondisiStopKontak();
    super.getJumlahStopKontak();
    super.getPosisiStopKontak();
            
    
    System.out.println("Jumlah Kabel LCD : ");
    int JumlahKabelLCD = input.nextInt();
    data.setJumlahKabelLCD(JumlahKabelLCD);
    System.out.println("Kondisi Kabel LCD : ");
    String KondisiKabelLCD = input.next();
    data.setKondisiKabelLCD(KondisiKabelLCD);
    System.out.println("Posisi Kabel LCD : ");
    String PosisiKabelLCD = input.next();
    data.setPosisiLabelLCD(PosisiKabelLCD);
    
    if (data.getJumlahKabelLCD()>=1 && data.getKondisiStopKontak().equals("Baik") && data.getPosisiStopKontak().equals("Depan")) {
        return; 
    }
    else{
    }
    
    super.getJumlahKabelLCD();
    super.getKondisiKabelLCD();
    super.getPosisiLabelLCD();
    
    System.out.println("Jumlah Kipas : ");
    int JumlahKipas = input.nextInt();
    data.setJumlahKipas(JumlahKipas);
    System.out.println("Kondisi Kipas : ");
    String KondisiKipas = input.next();
    data.setKondisiKipas(KondisiKipas);
    System.out.println("Posisi Kipas : ");
    String PosisiKipas = input.next();
    data.setPosisiKipas(PosisiKipas);
    
    if (data.getJumlahKipas()>=3 && data.getKondisiKipas()
        .equals("Bagus") && data.getPosisiKipas().equals("Atas")) {
        return; }
    else {
    }
    
    super.getJumlahKipas();
    super.getKondisiKipas();
    super.getPosisiKipas();
    
    System.out.println("Jumlah Lampu");
    int JumlahLampu = input.nextInt();
    data.setJumlahLampu(JumlahLampu);
    System.out.println("Kondisi Lampu : ");
    String KondisiLampu = input.next();
    data.setKondisiLampu(KondisiLampu);
    System.out.println("Posisi Lampu : ");
    String PosisiLampu = input.next();
    data.setPosisiLampu(PosisiLampu);
    
    if(data.getJumlahLampu()>=5 && data.getKondisiLampu()
       .equals("Bagus") && data.getPosisiLampu().equals("Atas")) {
        return; }
    else {
    }

    super.getJumlahLampu();
    super.getKondisiLampu();
    super.getPosisiLampu();
    
    
    System.out.println("Jumlah AC : ");
    int JumlahAC = input.nextInt();
    data.setJumlahAC(JumlahAC);
    System.out.println("Kondisi AC : ");
    String KondisiAC = input.next();
    data.setKondisiAC(KondisiAC);
    System.out.println("Posisi AC : ");
    String PosisiAC = input.next();
    data.setPosisiAC(PosisiAC);
    
    
    System.out.println("SSID : \n 1. UMM Hotspot \n 2. UMM Premium ");
    int SSID = input.nextInt();
    kelas.setSSID(SSID);
    if (data.getSSID() == 1) {
            return;
        }
    
    System.out.println("Bandwith : ");
    int Bandwith = input.nextInt();
    kelas.setBandwidth(Bandwith);  
    
    super.getBandwidth();
    
    System.out.println("Jumlah CCTV : ");
    int JumlahCCTV = input.nextInt();
    data.setJumlahCCTV(JumlahCCTV);
    System.out.println("Kondisi CCTV : ");
    String KondisiCCTV = input.next();
    data.setKondisiCCTV(KondisiCCTV);
    System.out.println("Posisi CCTV : ");
    String PosisiCCTV = input.next();
    data.setPosisiCCTV(PosisiCCTV);

    if (data.getJumlahCCTV() == 2 && data.getKondisiCCTV().equals("Bagus") && data.getPosisiCCTV().equals("Depan") && data.getPosisiCCTV().equals("Belakang")) {
        return;
        }
    }
    

    @Override
    public String getPosisiCCTV() {
        return super.getPosisiCCTV(); 
    }

    @Override
    public String getKondisiCCTV() {
        return super.getKondisiCCTV(); 
    }

    @Override
    public int getJumlahCCTV() {
        return super.getJumlahCCTV(); 
    }

    @Override
    public int getSSID() {
        return super.getSSID(); 
    }
    

    
    public void cetakDataKelas(){
        
    }

    

    
}
    
