package tb;
import java.util.Scanner;

public class TesKelas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        IdentitasKelas id = new IdentitasKelas();
        JKP jkp = new JKP();
        KeamananKelas aman = new KeamananKelas();
        KebersihanKelas bersih = new KebersihanKelas();
        KenyamananKelas nyaman = new KenyamananKelas();
        LingkunganKelas lingkung = new LingkunganKelas();
        
        id.IdentitasRuangKelas();
        id.KondisiKelas();
        jkp.JmlhKondisiSarana();
        aman.KeamananKelas();
        bersih.KebersihanRuangKelas();
        nyaman.KenyamananKelas();
        lingkung.LingkunganRuangKelas();
       
        
        System.out.println("Hasil? : ");
        String Pilihan = input.next();
    }
}
