package tb;
import java.util.Scanner;

abstract class Polimorfisme extends KelasUtama implements Ruang{
    Scanner input = new Scanner(System.in);
    class DepanCCTV extends KelasUtama{
    public void Posisi(){
        System.out.println("Depan");
    }
 
        @Override
        public void Jumlah() {
            super.Jumlah();
        }

        @Override
        public void Kondisi() {
            super.Kondisi();
        }
    }   
    
    class BaikCCTV extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class JumlahCCTV extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class KondisiCCTV extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class PosisiCCTV extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }
    }
    class JumlahStopKontak extends KelasUtama{
    public void Jumlah (){
        System.out.println("Tidak Terdefinisi");
    }

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class KondisiStopKontak extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah();
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
        
    }
    class PosisiStopKontak extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah();
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }
    }
    class JumlahKabelLCD extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinis");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class KondisiKabelLCD extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class PosisiKabelLCD extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }
    }
    class JumalahKipas extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }

        @Override
        public void Posisi() {
            super.Posisi();
        }
    }
    class KondisiKipas extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class PosisiKipas extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }
    }
    class JumlahLampu extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class KondisiLampu extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class PosisiLampu extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }
    }
    class JumlahAC extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinis");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }

        @Override
        public void Posisi() {
            super.Posisi();
        }
    }
    class KondisiAC extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }   

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Posisi() {
            super.Posisi(); 
        }
    }
    class PosisiAC extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }   

        @Override
        public void Jumlah() {
            super.Jumlah(); 
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); 
        }
    }
    
    
}