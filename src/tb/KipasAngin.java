package tb;
import java.util.Scanner;
import java.io.FileWriter;
public class KipasAngin implements JumlahKondisiSarana {
	Scanner input = new Scanner (System.in);
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
		System.out.println("masukkan jumlah Kipas Angin : ");
		Jumlah = input.nextInt();
		if(Jumlah >= 2){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisKondisi() {
		System.out.println("masukkan kondisi Kipas Angin : ");
		Kondisi = input.next();
		if(Kondisi.equals("baik") && Jumlah == 2){
			return 1;
		}
		else{
			return 0 ;
		}
	}

	@Override
	public int analisisPosisi() {
		System.out.println("masukkan posisi Kipas Angin: ");
		Posisi = input.next();
		if(Posisi.equals("atap_ruangan")){
			return 1;
		}
		else{
			return 0;
		}
	}

	public void Tampil() {
		System.out.println("Jumlah Kipas Angin : "+Jumlah);
		System.out.println("Kondisi Kipas Angin : "+Kondisi);
		System.out.println("Posisi Kipas Angin : "+Posisi);
                
                        
	}  
        public void simpan(){
          
                  try {
                FileWriter ketik = new FileWriter("KipasAngin.txt");
                ketik.write("Jumlah Kipas Angin : "+Jumlah);
                ketik.write("Kondisi Kipas Angin : "+Kondisi);
                ketik.write("Posisi Kipas Angin : "+Posisi);
                 ketik.close();      
            }
            catch (Exception a){
                a.printStackTrace();
            }
}  
}
