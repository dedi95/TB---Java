
package tb;
import java.util.Scanner;
import java.io.FileWriter;
public class KabelLCD implements JumlahKondisiSarana {
    Scanner input = new Scanner(System.in);
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
        System.out.println("Masukkan Jumlah Kabel LCD : ");
		Jumlah = input.nextInt();
		if(Jumlah >= 1){
			return 1;
		}
		else{
			return 0;
		}
    }

    @Override
    public int analisisKondisi() {
        System.out.println("Masukkan Kondisi Kabel LCD : ");
		Kondisi = input.next();
		if(Kondisi.equals("Berfungsi")){
			return 1;
		}
		else{
			return 0;
		}
    
    }

    @Override
    public int analisisPosisi() {
    System.out.println("Masukkan Posisi Kabel LCD : ");
		Posisi = input.next();
		if(Posisi.equals("Dekat Dosen")){
			return 1;
		}
		else{
			return 0;
		}
	}

	public void tampil() {
		System.out.println("Jumlah Kabel LCD : "+Jumlah);
		System.out.println("Kondisi Kabel LCD : "+Kondisi);
		System.out.println("Posisi Kabel LCD : "+Posisi);
	}
    
        
        public void simpan(){
          
                  try {
                FileWriter ketik = new FileWriter("LCD.txt");
                ketik.write("Jumlah Kabel LCD : "+Jumlah);
                ketik.write("Kondisi Kabel LCD : "+Kondisi);
                ketik.write("Posisi Kabel LCD : "+Posisi);
                 ketik.close();      
            }
            catch (Exception a){
                a.printStackTrace();
            }
}}
