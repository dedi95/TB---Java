
package inheritance;
public class Lampu extends JKPS {
	public Lampu(){
		System.out.println("Lampu");
		Input("lampu");
		View("lampu");
	}
        
	public void Analisis(){
		System.out.println("Analisis Lampu");
		if(Jumlah >= 18){
			System.out.println("Lampu SESUAI!");
		}
		else{
			System.out.println("Lampu TIDAK SESUAI!");
		}
		if(Kondisi.equals("baik")&& Jumlah == 18){
			System.out.println("Kondisi Lampu SESUAI!");
		}
		else{
			System.out.println("Kondisi Lampu TIDAK SESUAI!");
		}
		if(Posisi.equals("atap_ruangan")){
			System.out.println("posisi Lampu SESUAI!");
		}
		else{
			System.out.println("posisi Lampu TIDAK SESUAI!");
		}
	}
}
