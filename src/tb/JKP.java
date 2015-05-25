package tb;
import java.util.Scanner;

public class JKP extends TB {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    JKP data = new JKP() {};
    
    //inheritance has a tes
    //overiding perbaiki
    
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
    
    if (data.getJumlahKipas()>=2 && data.getKondisiKipas()
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
    public void setBahaya(String Bahaya) {
        super.setBahaya(Bahaya); 
    }

    @Override
    public String getBahaya() {
        return super.getBahaya(); 
    }

    @Override
    public void setKunciPintuJendela(String KunciPintuJendela) {
        super.setKunciPintuJendela(KunciPintuJendela); 
    }

    @Override
    public String getKunciPintuJendela() {
        return super.getKunciPintuJendela(); 
    }

    @Override
    public void setKekokohan(String Kekokohan) {
        super.setKekokohan(Kekokohan); 
    }

    @Override
    public String getKekokohan() {
        return super.getKekokohan(); 
    }

    @Override
    public void setKeausan(String Keausan) {
        super.setKeausan(Keausan); 
    }

    @Override
    public String getKeausan() {
        return super.getKeausan(); 
    }

    @Override
    public void setKerusakan(String Kerusakan) {
        super.setKerusakan(Kerusakan); 
    }

    @Override
    public String getKerusakan() {
        return super.getKerusakan(); 
    }

    @Override
    public void setKebocoran(String Kebocoran) {
        super.setKebocoran(Kebocoran); 
    }

    @Override
    public String getKebocoran() {
        return super.getKebocoran(); 
    }

    @Override
    public void setBau(String Bau) {
        super.setBau(Bau); 
    }

    @Override
    public String getBau() {
        return super.getBau(); 
    }

    @Override
    public void setKebisingan(String Kebisingan) {
        super.setKebisingan(Kebisingan); 
    }

    @Override
    public String getKebisingan() {
        return super.getKebisingan(); 
    }

    @Override
    public void setSuhuCel(int SuhuCel) {
        super.setSuhuCel(SuhuCel); 
    }

    @Override
    public int getSuhuCel() {
        return super.getSuhuCel();
    }

    @Override
    public void setKelembapan(int Kelembapan) {
        super.setKelembapan(Kelembapan); 
    }

    @Override
    public int getKelembapan() {
        return super.getKelembapan(); 
    }

    @Override
    public void setPencahayaan(int Pencahayaan) {
        super.setPencahayaan(Pencahayaan); 
    }

    @Override
    public int getPencahayaan() {
        return super.getPencahayaan();
    }

    @Override
    public void setSirkulasiUdara(String SirkulasiUdara) {
        super.setSirkulasiUdara(SirkulasiUdara);
    }

    @Override
    public String getSirkulasiUdara() {
        return super.getSirkulasiUdara(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiJendela(String KondisiJendela) {
        super.setKondisiJendela(KondisiJendela); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiJendela() {
        return super.getKondisiJendela(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiPintu(String KondisiPintu) {
        super.setKondisiPintu(KondisiPintu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiPintu() {
        return super.getKondisiPintu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiAtap(String KondisiAtap) {
        super.setKondisiAtap(KondisiAtap); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiAtap() {
        return super.getKondisiAtap(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiDinding(String KondisiDinding) {
        super.setKondisiDinding(KondisiDinding); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiDinding() {
        return super.getKondisiDinding(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiLantai(String KondisiLantai) {
        super.setKondisiLantai(KondisiLantai); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiLantai() {
        return super.getKondisiLantai(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosisiCCTV(String PosisiCCTV) {
        super.setPosisiCCTV(PosisiCCTV); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiCCTV(String KondisiCCTV) {
        super.setKondisiCCTV(KondisiCCTV); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahCCTV(int JumlahCCTV) {
        super.setJumlahCCTV(JumlahCCTV); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBandwidth(int Bandwidth) {
        super.setBandwidth(Bandwidth); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBandwidth() {
        return super.getBandwidth(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSSID(int SSID) {
        super.setSSID(SSID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosisiAC(String PosisiAC) {
        super.setPosisiAC(PosisiAC); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPosisiAC() {
        return super.getPosisiAC(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiAC(String KondisiAC) {
        super.setKondisiAC(KondisiAC); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiAC() {
        return super.getKondisiAC(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahAC(int JumlahAC) {
        super.setJumlahAC(JumlahAC); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getJumlahAC() {
        return super.getJumlahAC(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosisiKipas(String PosisiKipas) {
        super.setPosisiKipas(PosisiKipas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiKipas(String KondisiKipas) {
        super.setKondisiKipas(KondisiKipas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahKipas(int JumlahKipas) {
        super.setJumlahKipas(JumlahKipas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosisiLampu(String PosisiLampu) {
        super.setPosisiLampu(PosisiLampu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPosisiLampu() {
        return super.getPosisiLampu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiLampu(String KondisiLampu) {
        super.setKondisiLampu(KondisiLampu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiLampu() {
        return super.getKondisiLampu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahLampu(int JumlahLampu) {
        super.setJumlahLampu(JumlahLampu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getJumlahLampu() {
        return super.getJumlahLampu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosisiLabelLCD(String PosisiLabelLCD) {
        super.setPosisiLabelLCD(PosisiLabelLCD); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPosisiLabelLCD() {
        return super.getPosisiLabelLCD(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiKabelLCD(String KondisiKabelLCD) {
        super.setKondisiKabelLCD(KondisiKabelLCD); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiKabelLCD() {
        return super.getKondisiKabelLCD(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahKabelLCD(int JumlahKabelLCD) {
        super.setJumlahKabelLCD(JumlahKabelLCD); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getJumlahKabelLCD() {
        return super.getJumlahKabelLCD(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosisiStopKontak(String PosisiStopKontak) {
        super.setPosisiStopKontak(PosisiStopKontak); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPosisiStopKontak() {
        return super.getPosisiStopKontak(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKondisiStopKontak(String KondisiStopKontak) {
        super.setKondisiStopKontak(KondisiStopKontak); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKondisiStopKontak() {
        return super.getKondisiStopKontak(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahStopKontak(int JumlahStopKontak) {
        super.setJumlahStopKontak(JumlahStopKontak); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getJumlahStopKontak() {
        return super.getJumlahStopKontak(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahJendela(int JumlahJendela) {
        super.setJumlahJendela(JumlahJendela); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getJumlahJendela() {
        return super.getJumlahJendela(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahKursi(int JumlahKursi) {
        super.setJumlahKursi(JumlahKursi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getJumlahKursi() {
        return super.getJumlahKursi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahPintu(int JumlahPintu) {
        super.setJumlahPintu(JumlahPintu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getJumlahPintu() {
        return super.getJumlahPintu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBentukRuang(String BentukRuang) {
        super.setBentukRuang(BentukRuang); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBentukRuang() {
        return super.getBentukRuang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLebar(int Lebar) {
        super.setLebar(Lebar); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLebar() {
        return super.getLebar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPanjang(int Panjang) {
        super.setPanjang(Panjang); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPanjang() {
        return super.getPanjang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJurusan(String Jurusan) {
        super.setJurusan(Jurusan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJurusan() {
        return super.getJurusan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLokasiRuangan(String LokasiRuangan) {
        super.setLokasiRuangan(LokasiRuangan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLokasiRuangan() {
        return super.getLokasiRuangan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNamaRuangan(String NamaRuangan) {
        super.setNamaRuangan(NamaRuangan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNamaRuangan() {
        return super.getNamaRuangan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRasioLuas(int RasioLuas) {
        super.setRasioLuas(RasioLuas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRasioLuas() {
        return super.getRasioLuas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLuas(int Luas) {
        super.setLuas(Luas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLuas() {
        return super.getLuas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPosisiKipas() {
        return super.getPosisiKipas(); 
    }

    @Override
    public String getKondisiKipas() {
        return super.getKondisiKipas();
    }

    @Override
    public int getJumlahKipas() {
        return super.getJumlahKipas(); 
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

}
