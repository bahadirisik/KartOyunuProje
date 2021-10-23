package sample;
public class Futbolcu extends Sporcu{


    private int penalti;
    private int kaleciKarsiKarsiya;
    private int serbestVurus;
    private boolean kartKullanildiMi;


    public Futbolcu(){

    }
    public Futbolcu(int penalti,int kaleciKarsiKarsiya,int serbestVurus){
        this.penalti = penalti;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
        this.serbestVurus = serbestVurus;
    }
    public Futbolcu(String sporcuIsim,String sporcuTakim,int penalti,int kaleciKarsiKarsiya,int serbestVurus)
    {
        super(sporcuIsim,sporcuTakim);
        this.penalti = penalti;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
        this.serbestVurus = serbestVurus;
    }



    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public int getSerbestVurus() {
        return serbestVurus;
    }

    public void setSerbestVurus(int serbestVurus) {
        this.serbestVurus = serbestVurus;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public void sporcuPuaniGoster(){
        System.out.println("Adi : "+ getSporcuIsim() +" Takimi : "+ getSporcuTakim() + " Penalti : " + penalti + " Kaleciyle Karsi Karsiya : "+ kaleciKarsiKarsiya+ " Serbest Vurus : "+ serbestVurus);
    }








}