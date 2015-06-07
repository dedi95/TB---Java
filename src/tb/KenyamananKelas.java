package tb;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class KenyamananKelas extends KelasUtama{
    Scanner input = new Scanner(System.in);  
//    String file = "Kenyamanan.txt";
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
    public void Input() {
/*      System.out.println("Masukkan Bising : ");
        setKebisingan(input.next());      
        System.out.println("Masukkan Bau : ");
        setBau(input.next());
        System.out.println("Masukkan Bocor : ");
        setKebocoran(input.next());
        System.out.println("Masukkan Rusak : ");
        setKerusakan(input.next());        
        System.out.println("Masukkan Keausan : ");
        setKeausan(input.next());
*/    
    }

    @Override
    public void View() {
        System.out.println("Kebisingan = "+getKebisingan());
        System.out.println("Bau = "+getBau());
        System.out.println("Kebocoran = "+getKebocoran());
        System.out.println("Kerusakan = "+getKerusakan());
        System.out.println("Keausan = "+getKeausan());
    }

    @Override
    public void Analisa() {
        if(getKebisingan().equals("TIDAK BISING")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
	if(getBau().equals("TIDAK BAU")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
	if(getKebocoran().equals("TIDAK BOCOR")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
        if(getKerusakan().equals("TIDAK RUSAK")){
            System.out.println("SESUAI");
	}	
	else{
            System.out.println("TIDAK SESUAI");
	}
	if(getKeausan().equals("TIDAK AUS")){
            System.out.println("SESUAI");
	}
	else{
            System.out.println("TIDAK SESUAI");
	}
    }
    
    public void save(){
        try {
            FileWriter ketik = new FileWriter("Kenyamanan.txt");
            ketik.write("Kebisingan : "+getKebisingan());
            ketik.write("Bau : "+getBau());
            ketik.write("Kebocoran : "+getKebocoran());
            ketik.write("Kerusakan : "+getKerusakan());
            ketik.write("Keausan : "+getKeausan());
            ketik.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    } 
    
/*    public void Save(){
        try {
            ObjectOutputStream ketik = new ObjectOutputStream(new FileOutputStream(file));
            ketik.writeObject("Kebisingan : "+getKebisingan());
            ketik.writeObject("Bau : "+getBau());
            ketik.writeObject("Kebocoran : "+getKebocoran());
            ketik.writeObject("Kerusakan : "+getKerusakan());
            ketik.writeObject("Keausan : "+getKeausan());
            ketik.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }    
    
    public void read(){
        try{
        ObjectInputStream baca = new ObjectInputStream(new FileInputStream(file));
        baca.readObject();
	System.out.println("Kebisingan = "+getKebisingan());
        System.out.println("Bau = "+getBau());
        System.out.println("Kebocoran = "+getKebocoran());
        System.out.println("Kerusakan = "+getKerusakan());
        System.out.println("Keausan = "+getKeausan());
	baca.close();
    }
        catch(FileNotFoundException e){
              e.printStackTrace();
        }
        catch(ClassNotFoundException e){
              e.printStackTrace();
        }
	catch(IOException e){
            e.printStackTrace();
	}
    }   */
}
