package tb;import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class LingkunganKelas extends KelasUtama{
    Scanner input = new Scanner(System.in);
//    String file = "Lingkungan.txt";
    private String Lantai;
    private String Dinding;
    private String Atap;
    private String Pintu;
    private String Jendela;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getLantai() {
        return Lantai;
    }

    public void setLantai(String Lantai) {
        this.Lantai = Lantai;
    }

    public String getDinding() {
        return Dinding;
    }

    public void setDinding(String Dinding) {
        this.Dinding = Dinding;
    }

    public String getAtap() {
        return Atap;
    }

    public void setAtap(String Atap) {
        this.Atap = Atap;
    }

    public String getPintu() {
        return Pintu;
    }

    public void setPintu(String Pintu) {
        this.Pintu = Pintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }
    

    @Override
    public void Input() {
/*      System.out.println("Kondisi Lantai : ");
        setLantai(input.next());
        System.out.println("Kondisi Dinding : ");
        setDinding(input.next());
        System.out.println("Kondisi Atap : ");
        setAtap(input.next());
        System.out.println("Kondisi Pintu : ");
        setPintu(input.next());
        System.out.println("Kondisi Jendela : ");
        setJendela(input.next());
*/    
    }

    @Override
    public void View() {
        System.out.println("Kondisi Lantai : "+getLantai());
        System.out.println("Kondisi Dinding : "+getDinding());
        System.out.println("Kondisi Atap : "+getAtap());
        System.out.println("Kondisi Pintu : "+getPintu());
        System.out.println("Kondisi Jendela : "+getJendela());
    }

    @Override
    public void Analisa() {
                if(getLantai().equals("Bersih")){
			System.out.println("Kondisi Lantai SESUAI");
		}
		else{
			System.out.println("Kondisi Lantai TIDAK SESUAI");
		}
		if(getDinding().equals("Bersih")){
			System.out.println("kondisi dinding SESUAI");
		}
		else{
			System.out.println("Kondisi Dinding TIDAK SESUAI");
		}
		if(getAtap().equals("Bersih")){
			System.out.println("Kondisi Atap SESUAI");
		}
		else{
			System.out.println("Kondisi Atap TIDAK SESUAI");
		}
		if(getPintu().equals("Bersih")){
			System.out.println("Kondisi Pintu SESUAI");
		}
		else{
			System.out.println("Kondisi Pintu TIDAK SESUAI");
		}
		if(getJendela().equals("Bersih")){
			System.out.println("Kondisi Jendela SESUAI");
		}
		else{
			System.out.println("Kondisi Jendela TIDAK SESUAI");
		}
        
            }
    
    public void save(){
        try {
            FileWriter ketik = new FileWriter("Lingkungan.txt");
            ketik.write("Kondisi Lantai : "+getLantai());
            ketik.write("Kondisi Dinding : "+getDinding());
            ketik.write("Kondisi Atap : "+getAtap());
            ketik.write("Kondisi Pintu : "+getPintu());
            ketik.write("Kondisi Jendela : "+getJendela());
            ketik.close();
        }
        catch (Exception b){
            b.printStackTrace();
        }
    }        
    
    
/*    public void Save(){
        try {
            ObjectOutputStream ketik = new ObjectOutputStream(new FileOutputStream(file));
            ketik.writeObject("Kondisi Lantai : "+getLantai());
            ketik.writeObject("Kondisi Dinding : "+getDinding());
            ketik.writeObject("Kondisi Atap : "+getAtap());
            ketik.writeObject("Kondisi Pintu : "+getPintu());
            ketik.writeObject("Kondisi Jendela : "+getJendela());
            ketik.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception b){
            b.printStackTrace();
        }
    }
    
    public void read(){
        try{
            ObjectInputStream baca = new ObjectInputStream(new FileInputStream(file));
            baca.readObject();
            System.out.println("Lantai : "+getLantai());
            System.out.println("Dinding : "+getDinding());
            System.out.println("Atap : "+getAtap());
            System.out.println("Pintu : "+getPintu());
            System.out.println("Jendela : "+getJendela());
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
    }       */
}