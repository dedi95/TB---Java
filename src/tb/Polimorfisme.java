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
}
    class JumlahCCTV extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    
    }
    class KondisiCCTV extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    
    }
    class PosisiCCTV extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    
    }
    class JumlahStopKontak extends KelasUtama{
    public void Jumlah (){
        System.out.println("Tidak Terdefinisi");
    }
    }
    class KondisiStopKontak extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    
        
    }
    class PosisiStopKontak extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    
    }
    class JumlahKabelLCD extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinis");
    }    
    }
    class KondisiKabelLCD extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    
    }
    class PosisiKabelLCD extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    
    }
    class JumalahKipas extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    
    }
    class KondisiKipas extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    
    }
    class PosisiKipas extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    
    }
    class JumlahLampu extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinisi");
    }    
    }
    class KondisiLampu extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }    
    }
    class PosisiLampu extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }    
    }
    class JumlahAC extends KelasUtama{
    public void Jumlah(){
        System.out.println("Tidak Terdefinis");
    }    
    }
    class KondisiAC extends KelasUtama{
    public void Kondisi(){
        System.out.println("Baik");
    }   
    }
    class PosisiAC extends KelasUtama{
    public void Posisi(){
        System.out.println("Sesuai");
    }   
    }
    
}