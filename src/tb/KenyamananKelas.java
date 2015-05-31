package tb;
import java.util.Scanner;

public class KenyamananKelas extends TB{
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    private String hasilKebisingan;
    private String Kebisingan;
    private String Bau;
    private String hasilBau;
    private String Kebocoran;
    private String hasilKebocoran;
    private String Kerusakan;
    private String hasilKerusakan;
    private String Keausan;
    private String hasilKeausan;

    public void KenyamananKelas() {
        System.out.println("Masukkan Bising : ");
        String Kebisingan = input.next();
        System.out.println("Kebisingan = "+Kebisingan);
        kelas.setKebisingan(Kebisingan);        
        System.out.println("Masukkan Bau : ");
        String Bau = input.next();
        System.out.println("Bau = "+Bau);
        kelas.setBau(Bau);
        System.out.println("Masukkan Bocor : ");
        String Kebocoran = input.next();
        System.out.println("Kebocoran = "+Kebocoran);
        kelas.setKebocoran(Kebocoran);
        System.out.println("Masukkan Rusak : ");
        String Kerusakan = input.next();
        System.out.println("Kerusakan = "+Kerusakan);
        kelas.setKerusakan(Kerusakan);
        System.out.println("Masukkan Keausan : ");
        String Keausan = input.next();
        System.out.println("Keausan = "+Keausan);
        kelas.setKeausan(Keausan);

    }
    

    @Override
    public void setKeausan(String Keausan) {
        this.Keausan=Keausan;
        if(Keausan.equals("Tidak Aus")){
            hasilKeausan = "Aus";
        }
        super.setKeausan(Keausan); 
        return;
    }

    @Override
    public void setKerusakan(String Kerusakan) {
        this.Kerusakan=Kerusakan;
        if(Kerusakan.equals("Tidak Rusak")){
            hasilKerusakan = "Sesuai";
        }
        super.setKerusakan(Kerusakan); 
        return;
    }

    @Override
    public void setKebocoran(String Kebocoran) {
        this.Kebocoran=Kebocoran;
        if(Kebocoran.equals("Sesuai")){
            hasilKebocoran = "Tidak Bocor";
        }
        super.setKebocoran(Kebocoran); 
        return;
    }

    @Override
    public void setBau(String Bau) {
        this.Bau=Bau;
        if(Bau.equals("Tidak Sesuai")){
            hasilBau = "Sesuai";
        }
        super.setBau(Bau); 
        return;
    }

    @Override
    public void setKebisingan(String Kebisingan) {
        this.Kebisingan=Kebisingan;
        if(Kebisingan.equals("Tidak Sesuai")){
            hasilKebisingan ="Sesuai";
        }
        super.setKebisingan(Kebisingan);
        return;
    }
    
    
    void setdata(String Bau, String Kebocoran, String Kebisingan, String Kerusakan, String Keausan) {
        this.Bau=Bau;
        this.Kebocoran=Kebocoran;
        this.Kebisingan=Kebisingan;
        this.Kerusakan=Kerusakan;
        this.Keausan=Keausan;
        
    }
}

