package tb;
import java.util.Scanner;

public class KenyamananKelas {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    private String hasilKebisingan;
    private Object Kebisingan;
    private Object Bau;
    private String hasilBau;
    private Object Kebocoran;
    private String hasilKebocoran;
    private Object Kerusakan;
    private String hasilKerusakan;
    private Object Keausan;
    private String hasilKeausan;

    
    
    
    public void KenyamananKelas() {
        System.out.print("Kebisingan : ");
        String Kebisingan = input.next();
        kelas.setKebisingan(Kebisingan);        
        System.out.print("Bau : ");
        String Bau = input.next();
        kelas.setBau(Bau);
        System.out.print("Kebocoran : ");
        String Kebocoran = input.next();
        kelas.setKebocoran(Kebocoran);
        System.out.print("Kerusakan : ");
        String Kerusakan = input.next();
        kelas.setKerusakan(Kerusakan);
        System.out.print("Keausan : ");
        String Keausan = input.next();
        kelas.setKeausan(Keausan);

    }
    
    public String analisaKebisingan(){
        if(Kebisingan.equals("Tidak Sesuai")){
            hasilKebisingan ="Sesuai";
        }
        return null;
    }
    
    public String analisaBau(){
        if(Bau.equals("Tidak Sesuai")){
            hasilBau = "Sesuai";
        }
        return null;
    }
    
    public String analisaKebocoran(){
        
        if(Kebocoran.equals("Sesuai")){
            hasilKebocoran = "Tidak Bocor";
        }
        return null;
    }
    
    public String analisaKerusakan(){
        if(Kerusakan.equals("Tidak Rusak")){
            hasilKerusakan = "Sesuai";
        }
        return null;
    }
    
    public String analisaKeausan(){
        if(Keausan.equals("Tidak Ausan")){
            hasilKeausan = "Ausan";
        }
        
        return null;
    }
    
   

    public KenyamananKelas(String hasilKebisingan, Object Kebisingan, Object Bau, String hasilBau, Object Kebocoran, String hasilKebocoran, Object Kerusakan, String hasilKerusakan, Object Keausan, String hasilKeausan) {
        this.hasilKebisingan = hasilKebisingan;
        this.Kebisingan = Kebisingan;
        this.Bau = Bau;
        this.hasilBau = hasilBau;
        this.Kebocoran = Kebocoran;
        this.hasilKebocoran = hasilKebocoran;
        this.Kerusakan = Kerusakan;
        this.hasilKerusakan = hasilKerusakan;
        this.Keausan = Keausan;
        this.hasilKeausan = hasilKeausan;
    }
        
    KenyamananKelas() {
        throw new UnsupportedOperationException();
    }
    
    }

