package sample;
public class Kullanıcı extends Oyuncu{

    public Kullanıcı(){

    }
    public Kullanıcı(String oyuncuID,String oyuncuAdi,int skor)
    {
        super(oyuncuID,oyuncuAdi,skor);
    }

    public int kartSec(){
        return 1;
    }
}
