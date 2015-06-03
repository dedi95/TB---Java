package inheritance;

import java.util.*;
public class JKPS  {
    Scanner input = new Scanner(System.in);
	
    int Jumlah;
    String Kondisi;
    String Posisi;
    String Sarana;
	
    public void Input(String Sarana){
	this.Sarana = Sarana;
	System.out.println("masukkan Jumlah "+Sarana+":");
	Jumlah = input.nextInt();
	System.out.println("kondisi "+Sarana+":");
	Kondisi = input.next();
	System.out.println("posisi "+Sarana+":");
	Posisi = input.next();
    }
    public void View(String Sarana){
	this.Sarana = Sarana;
	System.out.println("\njumlah "+Sarana+":"+Jumlah);
	System.out.println("kondisi "+Sarana+":"+Kondisi);
	System.out.println("posisi "+Sarana+":"+Posisi);
    }
       
    public void Analisis(){
	System.out.println("\n*Analisis Stop Kontak*");
	if(Jumlah >= 4){
            System.out.println("Stop Kontak SESUAI!");
	}
		else{
			System.out.println("Stop Kontak TIDAK SESUAI!");
		}
		if(Kondisi.equals("baik")&& Jumlah == 4){
			System.out.println("kondisi Stop Kontak SESUAI!");
		}
		else{
			System.out.println("kondisi Stop Kontak TIDAK SESUAI!");
		}
		if(Posisi.equals("dekat_dosen")||Posisi.equals("dipojok_ruang")){
			System.out.println("posisi Stop Kontak SESUAI!");
		}
		else{
			System.out.println("posisi Stop Kontak TIDAK SESUAI!");
		}
	}

    void Analisis(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
