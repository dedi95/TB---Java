package tb;
import java.util.Scanner;

public class KeamananKelas {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    private Object Kekohan;
    private String hasilKekokohan;
    private Object KunciPintuJendela;
    private String hasilKunciPintuJendela;
    private Object Bahaya;
    private String hasilBahaya;
        
    public void KeamananKelas() {
        System.out.print("Kekokohan : ");
        String Kekokohan = input.next();
        kelas.setKekokohan(Kekokohan);
        System.out.print("Kunci Pintu dan Jendela : ");
        String KunciPintuJendela = input.next();
        kelas.setKunciPintuJendela(KunciPintuJendela);
        System.out.print("Bahaya : ");
        String Bahaya = input.next();
        kelas.setBahaya(Bahaya);
        
    }
    
    public String analisaKekokohan(){
        if(Kekohan.equals("Kokoh")){
            hasilKekokohan = "Sesuai";
    }    
        return null;
    }
    
    public String analisaKunciPintuJendela(){
        if (KunciPintuJendela.equals("Tidak Sesuai")){
            hasilKunciPintuJendela = "Sesuai";
    }
        return null;
    }
    
    public String analisaBahaya(){
        if(Bahaya.equals("Aman")){
            hasilBahaya = "Sesuai";
    }
       return null;
    }
    
}
