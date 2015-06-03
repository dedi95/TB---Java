
package tb;
import java.util.Scanner;
import java.io.FileWriter;
public class CCTV implements JumlahKondisiSarana{
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
System.out.println("Masukkan Jumlah CCTV : ");
		Jumlah = input.nextInt();
		if(Jumlah == 2){
			return 1;
		}
		else{
			return 0;
		}   
    }

    @Override
    public int analisisKondisi() {
    System.out.println("Masukkan Kondisi CCTV : ");
		Kondisi = input.next();
		if(Kondisi.equals("baik") && Jumlah == 2){
			return 1;
		}
		else{
			return 0; 
		} 
    }

    @Override
    public int analisisPosisi() {	
        System.out.println("Masukkan Posisi CCTV : ");
		Posisi = input.next();
		if(Posisi.equals("depan_dan_belakang")){
			return 1;
		}
		else{
			return 0;
		}
		
      }
    
	public void tampil() {
		System.out.println("Jumlah CCTV : "+Jumlah);
		System.out.println("Kondisi CCTV : "+Kondisi);
		System.out.println("Posisi CCTV : "+Posisi);	
	}
        
        public void simpan(){
            try {
                FileWriter ketik = new FileWriter("CCTV.txt");
                ketik.write("Jumlah CCTV : "+Jumlah);
                ketik.write("Kondisi CCTV : "+Kondisi);
                ketik.write("Posisi CCTV : "+Posisi);
                ketik.close();
                
            }
            catch (Exception a){
                a.printStackTrace();
            }
        }
    
}
