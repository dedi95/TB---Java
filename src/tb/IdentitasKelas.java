package tb;
import java.util.Scanner;

public class IdentitasKelas extends TB {
    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    
    public void IdentitasRuangKelas() {
        System.out.println("Nama Ruangan : ");
        String NamaRuangan = input.next();
        kelas.setNamaRuangan(NamaRuangan);
        System.out.println("Lokasi : ");
        String LokasiRuangan = input.next();
        kelas.setLokasiRuangan(LokasiRuangan);
        System.out.println("Jurusan : ");
        String Jurusan = input.next();
        kelas.setJurusan(Jurusan);
        
        
    }   
    
    public void KondisiKelas() {
        System.out.println("Masukkan Panjang : ");
        int Panjang = input.nextInt();
        kelas.setPanjang(Panjang);
        System.out.println("Masukkan Lebar : ");
        int Lebar = input.nextInt();
        kelas.setLebar(Lebar);

        kelas.setLuas(kelas.getPanjang() * kelas.getLebar());

        if (Panjang == Lebar) {
        kelas.setBentukRuang("Persegi Panjang");
        }

        System.out.println("Jumlah Pintu : ");
        int JumlahPintu = input.nextInt();
        kelas.setJumlahPintu(JumlahPintu);
        System.out.println("Jumlah Kursi : ");
        int JumlahKursi = input.nextInt();
        kelas.setJumlahKursi(JumlahKursi);
        System.out.println("Jumlah Jendela : ");
        int JumlahJendela = input.nextInt();
        kelas.setJumlahJendela(JumlahJendela);

        kelas.setRasioLuas(kelas.getLuas() / kelas.getJumlahJendela());
        if(kelas.getJumlahPintu() >=2) {
    
        }
        
        super.getJumlahPintu();
        super.getJumlahKursi();
        super.getJumlahJendela();
    }
    
    public void cetakKondisiKelas(){
        
    }
    
    
    
}
