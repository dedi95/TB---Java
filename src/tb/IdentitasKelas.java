package tb;
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
    
    public int KondisiKelas() {
        System.out.println("Masukkan Panjang Ruangan : ");
        data.setPanjang(input.nextInt());
        System.out.println("Masukkan Lebar Ruangan : ");
        data.setLebar(input.nextInt());
        System.out.println("Masukkan Jumlah Pintu : ");
        data.setJumlahPintu(input.nextInt());
        System.out.println("Masukkan Jumlah Kursi : ");
        data.setJumlahPintu(input.nextInt());
        System.out.println("Masukkan Jumlah Jendela : ");
        data.setJumlahJendela(input.nextInt());
        
        return 0;
    }
        public void cetakData() {
            System.out.println("Luas = "+Luas());
            System.out.println("Rasio Luas = "+RasioLuas());
        }
        
        float Luas() {
            return data.getPanjang()*data.getLebar();
	}
	
        double RasioLuas(){
            return Luas()/data.getJumlahKursi();
        }
}    
