package tb;
import java.util.Scanner;
import java.io.FileWriter;
public class AC implements JumlahKondisiSarana {
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
        System.out.println("masukkan jumlah AC : ");
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
        System.out.println("masukkan kondisi AC : ");
       Kondisi = input.next();
		if(Kondisi.equals("baik")){
			return 1;
		}
		else{
			return 0;
		}
    }
    
    @Override
    public int analisisPosisi() {
        System.out.println("masukkan posisi AC : ");
        Posisi = input.next();
                if(Posisi.equals("sesuai")){
                        return 1;
                }
                else{
                        return 0;
                }
    }
   
    public void tampilan(){
        System.out.println("masukkan jumlah AC "+Jumlah);
        System.out.println("masukkan kondisi AC"+Kondisi);
        System.out.println("masukkan posisi AC"+Posisi);
    }
    
    public void save(){
	try{
	FileWriter ketik = new FileWriter("AC.txt");
	ketik.write("Jumlah AC : "+Jumlah);
	ketik.write("Kondisi AC : "+Kondisi);
	ketik.write("Posisi AC : "+Posisi);
	ketik.close();
    }
	catch(Exception e){
            e.printStackTrace();
	}
    }
}
