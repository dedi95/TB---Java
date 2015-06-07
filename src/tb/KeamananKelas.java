package tb;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class KeamananKelas extends KelasUtama {
    Scanner input = new Scanner(System.in);
    String file = "Keamanan.txt";
    private String Kekokohan;
    private String KunciPintuJendela;
    private String Bahaya;

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintuJendela() {
        return KunciPintuJendela;
    }

    public void setKunciPintuJendela(String KunciPintuJendela) {
        this.KunciPintuJendela = KunciPintuJendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }
    
    
    @Override
    public void Input() {        
/*      System.out.println("Kekokohan : ");
        setKekokohan(input.next());
        System.out.println("Kunci Pintu dan Jendela : ");
        setKunciPintuJendela(input.next());
        System.out.println("Bahaya : ");
        setBahaya(input.next());
*/        
    }

    @Override
    public void View() {
        System.out.println("Kekokohan : "+getKekokohan());
        System.out.println("Kunci Pintu dan Jendela : "+getKunciPintuJendela());
        System.out.println("Bahaya : "+getBahaya());
    }

    @Override
    public void Analisa() {
            if(getKekokohan().equals("Kokohan")){
        	System.out.println("SESUAI!");
        }
            else{
            	System.out.println("TIDAK SESUAI!");
    	}
            if(getKunciPintuJendela().equals("Ada Kunci Pintu dan Jendela")){
		System.out.println("SESUAI!");
	}
            else{
		System.out.println("TIDAK SESUAI!");
	}
            if(getBahaya().equals("TIdak Bahaya")){
		System.out.println("SESUAI!");
	}	
            else{
		System.out.println("TIDAK SESUAI!");
		
	} 
    }
    
    public void Save(){
        try {
            ObjectOutputStream ketik = new ObjectOutputStream(new FileOutputStream(file));
            ketik.writeObject("Bahaya : "+getBahaya());
            ketik.writeObject("Kekokohan : "+getKekokohan());
            ketik.writeObject("Kunci Pintu Jendela : "+getKunciPintuJendela());
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
	System.out.println("Masukkan Bahaya : "+getBahaya());
        System.out.println("Masukkan Kokoh : "+getKekokohan());
        System.out.println("Masukkan Kunci Pintu dan Jendela : "+getKunciPintuJendela());
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
    }
        
}
