package inheritance;
    
public class CCTV extends JKPS{
	public CCTV(){
		System.out.println("CCTV");
		Input("CCTV");
		View("CCTV");
	}

    
  
	public void Analisis(){
		System.out.println("Analisis CCTV");
		if(Jumlah == 2){
			System.out.println("CCTV SESUAI!");
		}
		else{
			System.out.println("CCTV TIDAK SESUAI!");
		}
		if(Kondisi.equals("baik") && Jumlah == 2){
			System.out.println("kondisi CCTV SESUAI!");
		}
		else{
			System.out.println("kondisi CCTV TIDAK SESUAI!");
		}
		if(Posisi.equals("depan_dan_belakang")){
			System.out.println("posisi CCTV SESUAI!");
		}
	}
    
}
