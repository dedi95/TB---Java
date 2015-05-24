package tb;
import java.util.Scanner;

public class KenyamananKelas extends TB{
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
        System.out.println("Kebisingan : ");
        String Kebisingan = input.next();
        kelas.setKebisingan(Kebisingan);        
        System.out.println("Bau : ");
        String Bau = input.next();
        kelas.setBau(Bau);
        System.out.println("Kebocoran : ");
        String Kebocoran = input.next();
        kelas.setKebocoran(Kebocoran);
        System.out.println("Kerusakan : ");
        String Kerusakan = input.next();
        kelas.setKerusakan(Kerusakan);
        System.out.println("Keausan : ");
        String Keausan = input.next();
        kelas.setKeausan(Keausan);

    }
    
    public String analisaKebisingan(){
        if(Kebisingan.equals("Tidak Sesuai")){
            hasilKebisingan ="Sesuai";
        }
        return analisaKebisingan();
    }
    
    public String analisaBau(){
        if(Bau.equals("Tidak Sesuai")){
            hasilBau = "Sesuai";
        }
        return analisaBau();
    }
    
    public String analisaKebocoran(){
        
        if(Kebocoran.equals("Sesuai")){
            hasilKebocoran = "Tidak Bocor";
        }
        return analisaKebocoran();
    }
    
    public String analisaKerusakan(){
        if(Kerusakan.equals("Tidak Rusak")){
            hasilKerusakan = "Sesuai";
        }
        return analisaKerusakan();
    }
    
    public String analisaKeausan(){
        if(Keausan.equals("Tidak Aus")){
            hasilKeausan = "Aus";
        }
        
        return analisaKeausan();
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
        super.getKebisingan();
        super.getBau();
        super.getKebocoran();
        super.getKerusakan();
        super.getKeausan();
    }
    
    }

