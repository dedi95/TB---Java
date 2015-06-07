package tb;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Internet extends KelasUtama {
    Scanner input = new Scanner(System.in);
//    String file = "Internet.txt";
    private String SSID;
    private int Bandwidth;

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    @Override
    public void Input() {
/*      System.out.println("Masukkan SSID : ");
        setSSID(input.next());
        System.out.println("Masukkan Bandwidth : ");
        setBandwidth(input.nextInt());  
*/  }   

    @Override
    public void View() {
        System.out.println("SSID : "+getSSID());
        System.out.println("Besar Bandwidth : "+getBandwidth());
    }

    @Override
    public void Analisa() {
        if(getSSID().equals("UMM Hotspot")){
        	System.out.println("SESUAI!");
        }
            else{
            	System.out.println("TIDAK SESUAI!");
    	}        
        if(getBandwidth()>=25 && getBandwidth()<=150){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
    }
    
    public void save(){
        try {
            FileWriter ketik = new FileWriter("Internet.txt");
            ketik.write("Nama SSID : "+getSSID());
            ketik.write("Besar Bandwidth : "+getBandwidth());
            ketik.close();
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }
    
/*    public void Save(){
    try {
        ObjectOutputStream ketik = new ObjectOutputStream(new FileOutputStream(file));
            ketik.writeObject("SSID : "+getSSID());
            ketik.writeObject("Bandwidth : "+getBandwidth());
            ketik.close();
    }
    catch(FileNotFoundException e){
            e.printStackTrace();
    }
    catch (Exception a){
        a.printStackTrace();
    }    
    
    }
    
    public void read(){
        try {
            ObjectInputStream baca = new ObjectInputStream(new FileInputStream(file));
            baca.readObject();
            System.out.println("SSID : "+getSSID());
            System.out.println("Besar Bandwidth : "+getBandwidth());
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
