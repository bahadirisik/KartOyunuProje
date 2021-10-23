package sample;
public class Basketbolcu extends Sporcu{


    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private boolean kartKullanildiMi;

    public Basketbolcu(){

    }
    public Basketbolcu(int ikilik,int ucluk,int serbestAtis){
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public Basketbolcu(String sporcuIsim,String sporcuTakim,int ikilik,int ucluk,int serbestAtis){
        super(sporcuIsim,sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }


    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }




    public void sporcuPuaniGoster(){
        System.out.println("Adi: "+getSporcuIsim()+" Takimi : " +getSporcuTakim()+" Ikilik : " + ikilik + " Ucluk : "+ ucluk+ " Serbest Atis : "+ serbestAtis);
    }

}


