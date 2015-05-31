package tb;
import java.util.Scanner;

public class JKP extends TB {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    JKP data = new JKP() {};
    
    
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
    
    System.out.println("Jumlah Kabel LCD : ");
    int JumlahKabelLCD = input.nextInt();
    data.setJumlahKabelLCD(JumlahKabelLCD);
    System.out.println("Kondisi Kabel LCD : ");
    String KondisiKabelLCD = input.next();
    data.setKondisiKabelLCD(KondisiKabelLCD);
    System.out.println("Posisi Kabel LCD : ");
    String PosisiKabelLCD = input.next();
    data.setPosisiLabelLCD(PosisiKabelLCD);
    
    System.out.println("Jumlah Kipas : ");
    int JumlahKipas = input.nextInt();
    data.setJumlahKipas(JumlahKipas);
    System.out.println("Kondisi Kipas : ");
    String KondisiKipas = input.next();
    data.setKondisiKipas(KondisiKipas);
    System.out.println("Posisi Kipas : ");
    String PosisiKipas = input.next();
    data.setPosisiKipas(PosisiKipas);
    
    System.out.println("Jumlah Lampu");
    int JumlahLampu = input.nextInt();
    data.setJumlahLampu(JumlahLampu);
    System.out.println("Kondisi Lampu : ");
    String KondisiLampu = input.next();
    data.setKondisiLampu(KondisiLampu);
    System.out.println("Posisi Lampu : ");
    String PosisiLampu = input.next();
    data.setPosisiLampu(PosisiLampu);   
    
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

    
    }

    @Override
    public void setPosisiCCTV(String PosisiCCTV) {
        this.PosisiCCTV=PosisiCCTV;
        if(data.getPosisiCCTV().equals("Depan") && data.getPosisiCCTV().equals("Belakang")) {
    }
        else{
        }
        super.setPosisiCCTV(PosisiCCTV);
        return;
    }

    @Override
    public void setKondisiCCTV(String KondisiCCTV) {
        this.KondisiCCTV=KondisiCCTV;
        if(data.getKondisiCCTV().equals("Bagus")){
        }
        else{
        }
        super.setKondisiCCTV(KondisiCCTV);
        return;
    }

    @Override
    public void setJumlahCCTV(int JumlahCCTV) {
        this.JumlahCCTV=JumlahCCTV;
        if(data.getJumlahCCTV() == 2){
        }
        else{
        }
        super.setJumlahCCTV(JumlahCCTV); 
        return;
    }
    
    

    @Override
    public void setPosisiStopKontak(String PosisiStopKontak) {
        this.PosisiStopKontak=PosisiStopKontak;
        if (data.getJumlahStopKontak() > 2){
        }
        else{
        }
        super.setPosisiStopKontak(PosisiStopKontak); 
        return;
    }

    @Override
    public void setKondisiStopKontak(String KondisiStopKontak) {
        this.KondisiStopKontak=KondisiStopKontak;
        if (data.getKondisiStopKontak().equals("Baik")){
        }
        else{
            System.out.println("Kurang Baik");
        }
        super.setKondisiStopKontak(KondisiStopKontak);
        return;
    }

    @Override
    public void setJumlahStopKontak(int JumlahStopKontak) {
        this.JumlahStopKontak=JumlahStopKontak;
        if (data.getPosisiStopKontak().equals("Depan")){
        }
        else{
            System.out.println("Belakang");
        }
        super.setJumlahStopKontak(JumlahStopKontak);
        return;
    }

    @Override
    public void setPosisiLabelLCD(String PosisiLabelLCD) {
        this.PosisiLabelLCD=PosisiLabelLCD;
        if (data.getPosisiLabelLCD().equals("Depan")){
        }
        else{
            System.out.println("Belakang");
        }
        super.setPosisiLabelLCD(PosisiLabelLCD); 
        return;
    }

    @Override
    public void setKondisiKabelLCD(String KondisiKabelLCD) {
        this.KondisiKabelLCD=KondisiKabelLCD;
        if(data.getKondisiKabelLCD().equals("Baik")){
        }
        else{
            System.out.println("Kurang Baik");
        }
        super.setKondisiKabelLCD(KondisiKabelLCD);
        return;
    }

    @Override
    public void setJumlahKabelLCD(int JumlahKabelLCD) {
        this.JumlahKabelLCD=JumlahKabelLCD;
        if (data.getJumlahKabelLCD()>=1){
        }
        else{
        }
        super.setJumlahKabelLCD(JumlahKabelLCD); 
        return;
    }

    @Override
    public void setPosisiKipas(String PosisiKipas) {
        this.PosisiKipas=PosisiKipas;
        if (data.getPosisiKipas().equals("Atas")){
        }
        else{
            System.out.println("Bawah");
        }
        super.setPosisiKipas(PosisiKipas); 
        return;
    }

    @Override
    public void setKondisiKipas(String KondisiKipas) {
        this.KondisiKipas=KondisiKipas;
        if(data.getKondisiKipas().equals("Baik")){
        }
        else{
            System.out.println("Kurang Baik");
        }
        super.setKondisiKipas(KondisiKipas);
        return;
    }

    @Override
    public void setJumlahKipas(int JumlahKipas) {
        this.JumlahKipas=JumlahKipas;
        if(data.getJumlahKipas()>=2){
        }
        else{
        }
        super.setJumlahKipas(JumlahKipas);
        return;
    }

    @Override
    public void setPosisiLampu(String PosisiLampu) {
        this.PosisiLampu=PosisiLampu;
        if (data.getPosisiLampu().equals("Atas")){
        }
        else{
        }
        super.setPosisiLampu(PosisiLampu); 
        return;
    }

    @Override
    public void setKondisiLampu(String KondisiLampu) {
        this.KondisiLampu=KondisiLampu;
        if (data.getKondisiLampu().equals("Baik")){
        }
        else {
            System.out.println("Kurang Baik");
        }
        super.setKondisiLampu(KondisiLampu);
        return;
    }

    @Override
    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu=JumlahLampu;
        if (data.getJumlahLampu()>=5) {
        }
        else{
        }
        super.setJumlahLampu(JumlahLampu);
        return;
    }

    @Override
    public void setPosisiAC(String PosisiAC) {
        this.PosisiAC=PosisiAC;
        if(data.getPosisiAC().equals("Belakang")) {
        }
        else{
        }
        super.setPosisiAC(PosisiAC); 
        return;
    }

    @Override
    public void setKondisiAC(String KondisiAC) {
        this.KondisiAC=KondisiAC;
        if(data.getKondisiAC().equals("Baik")){
        }
        else{
            System.out.println("Kurang Baik");
        }
        super.setKondisiAC(KondisiAC);
        return;
    }

    @Override
    public void setJumlahAC(int JumlahAC) {
        this.JumlahAC=JumlahAC;
        if(data.getJumlahAC() >=1) {
        }
        else{
        }
        super.setJumlahAC(JumlahAC); 
    }
    
}
