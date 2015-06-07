package tb;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class KabelLCD implements JumlahKondisiSarana {
    Scanner input = new Scanner(System.in);
//    String file = "KabelLCD.txt";
    private int Jumlah;
    private String Kondisi;
    private String Posisi;

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String Kondisi) {
        this.Kondisi = Kondisi;
    }

    public String getPosisi() {
        return Posisi;
    }

    public void setPosisi(String Posisi) {
        this.Posisi = Posisi;
    }

    @Override
    public int analisisJumlah() {
/*        System.out.println("Masukkan Jumlah Kabel LCD : ");
		setJumlah(input.nextInt()); */
		if(getJumlah() >= 1){
			return 1;
		}
		else{
			return 0;
		}
    }

    @Override
    public int analisisKondisi() {
/*        System.out.println("Masukkan Kondisi Kabel LCD : ");
		setKondisi(input.next());   */
		if(getKondisi().equals("Berfungsi")){
			return 1;
		}
		else{
			return 0;
		}
    
    }

    @Override
    public int analisisPosisi() {
/*        System.out.println("Masukkan Posisi Kabel LCD : ");
		setPosisi(input.next());    */
		if(getPosisi().equals("Dekat Dosen")){
			return 1;
		}
		else{
			return 0;
		}
	}

    public void Tampil() {
	System.out.println("Jumlah Kabel LCD : "+getJumlah());
	System.out.println("Kondisi Kabel LCD : "+getKondisi());
	System.out.println("Posisi Kabel LCD : "+getPosisi());
    }
    
    public void save(){
        try {
            FileWriter ketik = new FileWriter("KabelLCD.txt");
            ketik.write("Jumlah Kabel LCD : "+getJumlah());
            ketik.write("Kondisi Kabel LCD : "+getKondisi());
            ketik.write("Posisi Kabel LCD : "+getPosisi());
            ketik.close();
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }
        
/*    public void Simpan(){          
        try {
            ObjectOutputStream ketik = new ObjectOutputStream(new FileOutputStream(file));
            ketik.writeObject("Jumlah Kabel LCD : "+getJumlah());
            ketik.writeObject("Kondisi Kabel LCD : "+getKondisi());
            ketik.writeObject("Posisi Kabel LCD : "+getPosisi());
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
	try{
	ObjectInputStream baca = new ObjectInputStream(new FileInputStream(file));
        baca.readObject();
	System.out.println("Masukkan Jumlah Kabel LCD "+getJumlah());
        System.out.println("Masukkan Kondisi Kabel LCD "+getKondisi());
        System.out.println("Masukkan Posisi Kabel LCD "+getPosisi());
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
