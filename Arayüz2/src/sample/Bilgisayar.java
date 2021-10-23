package sample;

public class Bilgisayar extends Oyuncu{
    private boolean bekleme;
    private int bilgisayarsirasi;


    public Bilgisayar(){

    }

    public Bilgisayar(String oyuncuID,String oyuncuAdi,int skor)
    {
        super(oyuncuID,oyuncuAdi,skor);
    }
    public int kartSec(){
        return 1;
    }

    public boolean isBekleme() {
        return bekleme;
    }

    public void setBekleme(boolean bekleme) {
        this.bekleme = bekleme;
    }

    public int getBilgisayarsirasi() {
        return bilgisayarsirasi;
    }

    public void setBilgisayarsirasi(int bilgisayarsirasi) {
        this.bilgisayarsirasi = bilgisayarsirasi;
    }
}