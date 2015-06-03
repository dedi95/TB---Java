package tb;
import java.util.Scanner;
import java.io.FileWriter;

public class KeamananKelas extends KelasUtama {
    Scanner input = new Scanner(System.in);
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
    void Input() {        
        System.out.println("Kekokohan : ");
        String Kekokohan = input.next();
        System.out.println("Kunci Pintu dan Jendela : ");
        String KunciPintuJendela = input.next();
        System.out.println("Bahaya : ");
        String Bahaya = input.next();
        
    }

    @Override
    void View() {
        System.out.println("Kekokohan : "+Kekokohan);
        System.out.println("Kunci Pintu dan Jendela : "+KunciPintuJendela);
        System.out.println("Bahaya : "+Bahaya);
    }

    @Override
    void Analisa() {
            if(Kekokohan.equals("Kokohan")){
        	System.out.println("SESUAI!");
        }
            else{
            	System.out.println("TIDAK SESUAI!");
    	}
            if(KunciPintuJendela.equals("Ada Kunci Pintu dan Jendela")){
		System.out.println("SESUAI!");
	}
            else{
		System.out.println("TIDAK SESUAI!");
	}
            if(Bahaya.equals("TIdak Bahaya")){
		System.out.println("SESUAI!");
	}	
            else{
		System.out.println("TIDAK SESUAI!");
		
	} 
    }
    
    public void Save(){
        try {
            FileWriter set = new FileWriter("Simpan.txt");
            set.write("Kekokohan : "+Kekokohan);
            set.write("Kunci Pintu Jendela : "+KunciPintuJendela);
            set.write("Bahaya : "+Bahaya);
            set.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
        
}
