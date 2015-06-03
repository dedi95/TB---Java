package inheritance;

public class LCD extends JKPS {
    public LCD(){
	System.out.println("Kabel LCD");
	Input("kabel LCD");
	View("kabel LCD");
    }

    public void Analisis(){
	System.out.println("Analisis Kabel LCD");
	if(Jumlah >= 1){
            System.out.println("Kabel LCD SESUAI!");
	}
        else {
            System.out.println("Kabel LCD TIDAK SESUAI!");
	}
	if(Kondisi.equals("berfungsi")){
            System.out.println("Kondisi LCD SESUAI!");
	}
        else {
            System.out.println("Kondisi LCD TIDAK SESUAI!");
	}
	if(Posisi.equals("dekat_dosen")){
            System.out.println("Posisi Kabel LCD SESUAI!");
	}
        else {
            System.out.println("posisi Kabel LCD TIDAK SESUAI!");
	}
    }
}
