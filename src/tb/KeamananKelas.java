package tb;
import java.util.Scanner;

public class KeamananKelas extends TB{
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    private Object Kekohan;
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

    
    public KeamananKelas(Object Kekohan, String hasilKekokohan, Object KunciPintuJendela, String hasilKunciPintuJendela, Object Bahaya, String hasilBahaya) {
        this.Kekohan = Kekohan;
        this.hasilKekokohan = hasilKekokohan;
        this.KunciPintuJendela = KunciPintuJendela;
        this.hasilKunciPintuJendela = hasilKunciPintuJendela;
        this.Bahaya = Bahaya;
        this.hasilBahaya = hasilBahaya;
    }

    public KeamananKelas() {
        super.getKekokohan();
        super.getKunciPintuJendela();
        super.getBahaya();
    }
    
}
