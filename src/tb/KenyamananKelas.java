package tb;
import java.io.FileWriter;
import java.util.Scanner;

public class KenyamananKelas extends KelasUtama{
    Scanner input = new Scanner(System.in);  
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }
    

    @Override
    void Input() {
        System.out.println("Masukkan Bising : ");
        String Kebisingan = input.next();      
        System.out.println("Masukkan Bau : ");
        String Bau = input.next();
        System.out.println("Masukkan Bocor : ");
        String Kebocoran = input.next();
        System.out.println("Masukkan Rusak : ");
        String Kerusakan = input.next();        
        System.out.println("Masukkan Keausan : ");
        String Keausan = input.next();
    }

    @Override
    void View() {
        System.out.println("Kebisingan = "+Kebisingan);
        System.out.println("Bau = "+Bau);
        System.out.println("Kebocoran = "+Kebocoran);
        System.out.println("Kerusakan = "+Kerusakan);
        System.out.println("Keausan = "+Keausan);
    }

    @Override
    void Analisa() {
        if(Kebisingan.equals("TIDAK BISING")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
	if(Bau.equals("TIDAK BAU")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
	if(Kebocoran.equals("TIDAK BOCOR")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
        if(Kerusakan.equals("TIDAK RUSAK")){
            System.out.println("SESUAI");
	}	
	else{
            System.out.println("TIDAK SESUAI");
	}
	if(Keausan.equals("TIDAK AUS")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
    }
    
    public void Save(){
        try {
            FileWriter set = new FileWriter("Simpan.txt");
            set.write("Kebisingan : "+Kebisingan);
            set.write("Bau : "+Bau);
            set.write("Kebocoran : "+Kebocoran);
            set.write("Kerusakan : "+Kerusakan);
            set.write("Keausan : "+Keausan);
            set.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
