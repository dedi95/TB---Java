
package inheritance;



public class AC extends JKPS{
	public AC(){
		System.out.println("AC");
		Input("AC");
		View("AC");
	}



	public void Analisis(){
		System.out.println("Analisis AC");
		if(Jumlah >= 1){
			System.out.println("AC SESUAI!");
		}
		else{
			System.out.println("AC TIDAK SESUAI!");
		}
		if(Kondisi.equals("baik")){
			System.out.println("konidis AC SESUAI!");
		}
		else{
			System.out.println("kondisi AC TIDAK SESUAI!");
		}
		if(Posisi.equals("disamping")||Posisi.equals("dibelakang")){
			System.out.println("posisi AC SESUAI!");
		}
		else{
			System.out.println("posisi AC TIDAK SESUAI!");
		}
	}
}
    

    

