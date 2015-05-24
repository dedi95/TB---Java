package tb;

public interface Ruang {
    void StopKontak();
    void KabelLCD();
    void Kipas();
    void Lampu();
    void AC();
    void CCTV();
    void Pintu();

    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);

    @Override
    public int hashCode();
}
