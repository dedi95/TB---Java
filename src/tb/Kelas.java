package tb;

public abstract class Kelas implements Ruang {

    @Override
    public void Pintu(){
        System.out.println("Pintu");
    }

    @Override
    public void CCTV(){
        System.out.println("CCTV");
    }

    @Override
    public void AC(){
        System.out.println("AC");
    }

    @Override
    public void Lampu(){
        System.out.println("Lampu");
    }

    @Override
    public void Kipas(){
        System.out.println("Kipas");
    }

    @Override
    public void KabelLCD(){
        System.out.println("Kabel LCD");
    }

    @Override
    public void StopKontak(){
        System.out.println("Stop Kontak");
    }

    @Override
    public void Jendela(){
        System.out.println("Jendela");
    }
    
}
