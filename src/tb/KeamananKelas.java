package tb;
import java.util.Scanner;

public class KeamananKelas extends TB {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();

    
    private Object Kekokohan;
    private String hasilKekokohan;
    private Object KunciPintuJendela;
    private String hasilKunciPintuJendela;
    private Object Bahaya;
    private String hasilBahaya;
        
    public void KeamananKelas() {
        System.out.println("Kekokohan : ");
        String Kekokohan = input.next();
        kelas.setKekokohan(Kekokohan);
        System.out.println("Kunci Pintu dan Jendela : ");
        String KunciPintuJendela = input.next();
        kelas.setKunciPintuJendela(KunciPintuJendela);
        System.out.println("Bahaya : ");
        String Bahaya = input.next();
        kelas.setBahaya(Bahaya);
        
    }

    @Override
    public void setKekokohan(String Kekokohan) {
        this.Kekokohan=Kekokohan;
        if(Kekokohan.equals("Kokoh")){
            hasilKekokohan = "Sesuai";
    }
        super.setKekokohan(Kekokohan); 
        return;
    }  

    
    @Override
    public void setKunciPintuJendela(String KunciPintuJendela) {
        this.KunciPintuJendela=KunciPintuJendela;
        this.hasilKunciPintuJendela=hasilKunciPintuJendela;
        if (KunciPintuJendela.equals("Tidak Sesuai")){
            hasilKunciPintuJendela = "Sesuai";
    }
        super.setKunciPintuJendela(KunciPintuJendela);
        return;
    }
    

    @Override
    public void setBahaya(String Bahaya) {
        this.Bahaya=Bahaya;
        this.hasilBahaya=hasilBahaya;
        if(Bahaya.equals("Aman")){
            hasilBahaya = "Sesuai";
    }
        super.setBahaya(Bahaya);
        return;
    }   

    
    public void setdata(String Bahaya, String Kekokohan, String Kerusakan) {
        this.Bahaya=Bahaya;
        this.Kekokohan=Kekokohan;
        this.Kerusakan=Kerusakan;
        super.setdata(Bahaya, Kekokohan, Kerusakan); 
    }
    
}
