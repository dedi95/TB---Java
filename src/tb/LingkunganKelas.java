package tb;
import java.io.FileWriter;
import java.util.Scanner;

public class LingkunganKelas extends KelasUtama{
    Scanner input = new Scanner(System.in);
    private String Lantai;
    private String Dinding;
    private String Atap;
    private String Pintu;
    private String Jendela;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getLantai() {
        return Lantai;
    }

    public void setLantai(String Lantai) {
        this.Lantai = Lantai;
    }

    public String getDinding() {
        return Dinding;
    }

    public void setDinding(String Dinding) {
        this.Dinding = Dinding;
    }

    public String getAtap() {
        return Atap;
    }

    public void setAtap(String Atap) {
        this.Atap = Atap;
    }

    public String getPintu() {
        return Pintu;
    }

    public void setPintu(String Pintu) {
        this.Pintu = Pintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }
    

    @Override
    void Input() {
        System.out.println("Kondisi Lantai : ");
        String KondisiLantai = input.next();
        System.out.println("Kondisi Dinding : ");
        String KondisiDinding = input.next();
        System.out.println("Kondisi Atap : ");
        String KondisiAtap = input.next();
        System.out.println("Kondisi Pintu : ");
        String KondisiPintu = input.next();
        System.out.println("Kondisi Jendela : ");
        String KondisiJendela = input.next();
        }

    @Override
    void View() {
        System.out.println("Kondisi Lantai : "+Lantai);
        System.out.println("Kondisi Dinding : "+Dinding);
        System.out.println("Kondisi Atap : "+Atap);
        System.out.println("Kondisi Pintu : "+Pintu);
        System.out.println("Kondisi Jendela : "+Jendela);}

    @Override
    void Analisa() {
                if(Lantai.equals("bersih")){
			System.out.println("kondisi lantai SESUAI");
		}
		else{
			System.out.println("kondisi lantai TIDAK SESUAI");
		}
		if(Dinding.equals("bersih")){
			System.out.println("kondisi dinding SESUAI");
		}
		else{
			System.out.println("kondisi dinding TIDAK SESUAI");
		}
		if(Atap.equals("bersih")){
			System.out.println("kondisi atap SESUAI");
		}
		else{
			System.out.println("kondisi atap TIDAK SESUAI");
		}
		if(Pintu.equals("bersih")){
			System.out.println("kondisi pintu SESUAI");
		}
		else{
			System.out.println("kondisi pintu TIDAK SESUAI");
		}
		if(Jendela.equals("bersih")){
			System.out.println("kondisi jendela SESUAI");
		}
		else{
			System.out.println("kondisi jendela TIDAK SESUAI");
		}
        
    }
    
    public void Save(){
        try {
            FileWriter set = new FileWriter("Simpan.txt");
            set.write("Kondisi Lantai : "+Lantai);
            set.write("Kondisi Dinding : "+Dinding);
            set.write("Kondisi Atap : "+Atap);
            set.write("Kondisi Pintu : "+Pintu);
            set.write("Kondisi Jendela : "+Jendela);
            set.close();
        }
        catch (Exception b){
            b.printStackTrace();
        }
    }
}