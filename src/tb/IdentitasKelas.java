package tb;
import java.io.FileWriter;
import java.util.Scanner;

public class IdentitasKelas {
    Scanner input = new Scanner(System.in);
    TB data = new TB();
    
    public void IdentitasRuangKelas() {
        System.out.println("Nama Ruangan : ");
        data.setNamaRuangan(input.nextInt());
        System.out.println("Lokasi : ");
        data.setLokasiRuangan(input.next());
        System.out.println("Jurusan : ");
        data.setJurusan(input.next());
        
    }   
    
    public void KondisiKelas() {
        System.out.println("Masukkan Panjang Ruangan : ");
        data.setPanjang(input.nextInt());
        System.out.println("Masukkan Lebar Ruangan : ");
        data.setLebar(input.nextInt());
        System.out.println("Masukkan Jumlah Pintu : ");
        data.setJumlahPintu(input.nextInt());
        System.out.println("Masukkan Jumlah Kursi : ");
        data.setJumlahKursi(input.nextInt());
        System.out.println("Masukkan Jumlah Jendela : ");
        data.setJumlahJendela(input.nextInt());
        
            }
    float Luas() {
            return data.getPanjang()*data.getLebar();
	}
	
    double RasioLuas(){
            return Luas()/data.getJumlahKursi();
        }    
    public void cetakData() {
            System.out.println("Luas = "+Luas());
            System.out.println("Rasio Luas = "+RasioLuas());
        }
    
    public void Save(){
	try{
	FileWriter ketik = new FileWriter("Identitas.txt");
	ketik.write("Nama Ruangan : "+data.getNamaRuangan());
	ketik.write("Lokasi : "+data.getLokasiRuangan());
	ketik.write("Jurusan : "+data.getJurusan());
	ketik.write("Panjang : "+data.getPanjang());
        ketik.write("Lebar : "+data.getLebar());
        ketik.write("Jumlah Pintu : "+data.getJumlahPintu());
        ketik.write("Jumlah Kursi : "+data.getJumlahKursi());
        ketik.write("Jumlah Jendela : "+data.getJumlahJendela());
        ketik.close();
    }
	catch(Exception e){
            e.printStackTrace();
	}
    }
        
}    
