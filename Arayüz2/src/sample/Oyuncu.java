package sample;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.*;



public class Oyuncu {

    private String oyuncuID;
    private String oyuncuAdi;
    private int skor;
    private ArrayList<Basketbolcu> kartListesiBas = new ArrayList<>();
    private ArrayList<Futbolcu> kartListesiFut = new ArrayList<>();
    private int sıra;


    public Oyuncu(){

    }
    public Oyuncu(String oyuncuID,String oyuncuAdi,int skor){
        this.oyuncuAdi = oyuncuAdi;
        this.oyuncuID = oyuncuID;
        this.skor = skor;
    }


    public int kartSec() {
        return 1;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setSkor(int skor) {
        this.skor += skor;
    }


    public int skorGoster(){
        return skor;
    }


    public ArrayList<Basketbolcu> getKartListesiBas() {
        return kartListesiBas;
    }

    public void setKartListesiBas(ArrayList<Basketbolcu> kartListesiBas) {
        this.kartListesiBas.addAll(kartListesiBas);
    }

    public ArrayList<Futbolcu> getKartListesiFut() {
        return kartListesiFut;
    }

    public void setKartListesiFut(ArrayList<Futbolcu> kartListesiFut) {
        this.kartListesiFut.addAll(kartListesiFut);
    }

    public Futbolcu getKartListesiFut(int a) {
        return kartListesiFut.get(a);
    }

    public Basketbolcu getKartListesiBas(int a) {
        return kartListesiBas.get(a);
    }

    public int getSıra() {
        return sıra;
    }

    public void setSıra(int sıra) {
        this.sıra += sıra;
    }
}
