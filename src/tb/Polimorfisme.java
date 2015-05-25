package tb;

public class Polimorfisme extends KelasUtama {
    
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
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class JumlahCCTV extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class KondisiCCTV extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class PosisiCCTV extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class JumlahStopKontak extends KelasUtama{
    public void Jumlah (){
        System.out.println("Tidak Terdefinisi");
    }

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class KondisiStopKontak extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    class PosisiStopKontak extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class JumlahKabelLCD extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinis");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class KondisiKabelLCD extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class PosisiKabelLCD extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class JumalahKipas extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class KondisiKipas extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class PosisiKipas extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class JumlahLampu extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class KondisiLampu extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class PosisiLampu extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class JumlahAC extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinis");
    }    

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class KondisiAC extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }   

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Posisi() {
            super.Posisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    class PosisiAC extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }   

        @Override
        public void Jumlah() {
            super.Jumlah(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void Kondisi() {
            super.Kondisi(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}