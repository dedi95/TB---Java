
package inheritance;


public class KipasAngin extends JKPS {
	public KipasAngin(){
		System.out.println("Kipas Angin");
		Input("kipas angin");
		View("kipas angin");
	}

	public void Analisis(){
		System.out.println("Analisis Kipas Angin");
		if(Jumlah >= 2){
			System.out.println("Kipas Angin SESUAI!");
		}
		else{
			System.out.println("Kipas Angin TIDAK SESUAI!");
		}
		if(Kondisi.equals("baik") && Jumlah == 2){
			System.out.println("Kondisi Kipas Angin SESUAI!");
		}
		else{
			System.out.println("Kondisi Kipas Angin TIDAK SESUAI!");
		}
		if(Posisi.equals("atap_ruangan")){
			System.out.println("posisi Kipas Angin SESUAI!");
		}
		else{
			System.out.println("posisi Kipas Angin TIDAK SESUAI!");
		}
	}
}
