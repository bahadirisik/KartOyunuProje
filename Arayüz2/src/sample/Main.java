package sample;


import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.css.PseudoClass;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.awt.*;
import java.lang.Thread;
import java.util.*;

import java.sql.Time;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static javafx.scene.paint.Color.*;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setScene(new Scene(root, 1280, 760));

       primaryStage.setHeight(760);
        primaryStage.setWidth(1280);

        primaryStage.setTitle("Kart Oyunu");



        Label Kulpuan=new Label("Puan:");
        Label Bilpuan= new Label("Puan:");


        Label Futbol= new Label("FUTBOLCULAR");
        Label Basket = new Label("BASKETBOLCULAR");
        Label kazanaLabel = new Label("Lütfen Seçim Yapınız");
        Label secimLabel = new Label("Kart Oyununa Hoşgeldiniz");

        kazanaLabel.setMinWidth(150);
        kazanaLabel.setMinHeight(10);

        Bilpuan.setMinWidth(50);
        Bilpuan.setMinHeight(10);

        Kulpuan.setMinWidth(50);
        Kulpuan.setMinHeight(10);

        secimLabel.setMinWidth(120);
        secimLabel.setMinHeight(10);

        Futbol.setMinWidth(100);
        Futbol.setMinHeight(10);

        Basket.setMinWidth(100);
        Basket.setMinHeight(10);

        kazanaLabel.setScaleX(2);
        kazanaLabel.setScaleY(2);

        Futbol.setScaleX(2);
        Futbol.setScaleY(2);

        Basket.setScaleX(2);
        Basket.setScaleY(2);

        Kulpuan.setScaleX(2);
        Kulpuan.setScaleY(2);

        Bilpuan.setScaleX(2);
        Bilpuan.setScaleY(2);



        kazanaLabel.setFont(new Font("Cambria",10));
        secimLabel.setFont(new Font("Cambria",10));

        secimLabel.setScaleX(3);
        secimLabel.setScaleY(3);

        kazanaLabel.setTranslateX(670);
        kazanaLabel.setTranslateY(360);

        Bilpuan.setTranslateX(100);
        Bilpuan.setTranslateY(100);

        Kulpuan.setTranslateX(150);
        Kulpuan.setTranslateY(600);

        Futbol.setTranslateX(950);
        Futbol.setTranslateY(350);

        Basket.setTranslateX(-200);
        Basket.setTranslateY(350);



        secimLabel.setTranslateX(530);
        secimLabel.setTranslateY(250);
        secimLabel.setBackground(new Background(new BackgroundFill(GOLD, null,null)));
        Bilpuan.setBackground(new Background(new BackgroundFill(GOLD, null,null)));
        Kulpuan.setBackground(new Background(new BackgroundFill(GOLD, null,null)));
        kazanaLabel.setBackground(new Background(new BackgroundFill(GOLD, null,null)));
        Basket.setBackground(new Background(new BackgroundFill(GOLD, null,null)));
        Futbol.setBackground(new Background(new BackgroundFill(GOLD, null,null)));




        HBox root = new HBox();


        int xDegerKulBas = -550;
        int yDegerKulBas = 500;
        int xDegerKulFut = 50;
        int yDegerKulFut = 500;

        int xDegerBilBas = -1390;
        int yDegerBilBas = 10;
        int xDegerBilFut = -800;
        int yDegerBilFut = 10;

        Button kulButton1 = new Button();
        Button kulButton2 = new Button();
        Button kulButton3 = new Button();
        Button kulButton4 = new Button();
        Button kulButton5 = new Button();
        Button kulButton6 = new Button();
        Button kulButton7 = new Button();
        Button kulButton8 = new Button();

        Button bilButton1 = new Button();
        Button bilButton2 = new Button();
        Button bilButton3 = new Button();
        Button bilButton4 = new Button();
        Button bilButton5 = new Button();
        Button bilButton6 = new Button();
        Button bilButton7 = new Button();
        Button bilButton8 = new Button();




        ArrayList<Button> kulButtonsBas = new ArrayList<>();
        ArrayList<Button> kulButtonsFut = new ArrayList<>();
        ArrayList<Button> bilButtonsBas = new ArrayList<>();
        ArrayList<Button> bilButtonsFut = new ArrayList<>();
        ArrayList<Button> butunButtons = new ArrayList<>();

        //Kullanıcının Basketbol Kartlarının Butonları
        kulButtonsBas.add(0,kulButton1);
        kulButtonsBas.add(1,kulButton2);
        kulButtonsBas.add(2,kulButton3);
        kulButtonsBas.add(3,kulButton4);
        //Kullanıcının Futbol Kartlarının Butonları
        kulButtonsFut.add(0,kulButton5);
        kulButtonsFut.add(1,kulButton6);
        kulButtonsFut.add(2,kulButton7);
        kulButtonsFut.add(3,kulButton8);
        //Bilgisayarın Basketbol Kartlarının Butonları
        bilButtonsBas.add(0,bilButton1);
        bilButtonsBas.add(1,bilButton2);
        bilButtonsBas.add(2,bilButton3);
        bilButtonsBas.add(3,bilButton4);
        //Bilgisayarın Futbol Kartlarının Butonları
        bilButtonsFut.add(0,bilButton5);
        bilButtonsFut.add(1,bilButton6);
        bilButtonsFut.add(2,bilButton7);
        bilButtonsFut.add(3,bilButton8);


        //Kullanıcının Kart Yerlerini Ayarlar
        for(int i=0;i<4;i++)
        {
            kulButtonsBas.get(i).setMinSize(100,210);
            kulButtonsBas.get(i).setTranslateX(xDegerKulBas);
            kulButtonsBas.get(i).setTranslateY(yDegerKulBas);
        }
        for(int i=0;i<4;i++)
        {
            kulButtonsFut.get(i).setMinSize(100,210);
            kulButtonsFut.get(i).setTranslateX(xDegerKulFut);
            kulButtonsFut.get(i).setTranslateY(yDegerKulFut);
        }

        //Bilgisayarın Kart Yerlerini Ayarlar
        for(int i=0;i<4;i++)
        {
            bilButtonsBas.get(i).setMinSize(100,210);
            bilButtonsBas.get(i).setTranslateX(xDegerBilBas);
            bilButtonsBas.get(i).setTranslateY(yDegerBilBas);
        }
        for(int i=0;i<4;i++)
        {
            bilButtonsFut.get(i).setMinSize(100,210);
            bilButtonsFut.get(i).setTranslateX(xDegerBilFut);
            bilButtonsFut.get(i).setTranslateY(yDegerBilFut);
        }

        //Kullanıcı ve PC Kartları Tek Bir Yerde Toplanır
        butunButtons.addAll(kulButtonsBas);
        butunButtons.addAll(kulButtonsFut);
        butunButtons.addAll(bilButtonsBas);
        butunButtons.addAll(bilButtonsFut);

        root.getChildren().addAll(kazanaLabel,secimLabel,Futbol,Basket,Kulpuan,Bilpuan);
        root.getChildren().addAll(butunButtons);
        root.setSpacing(5);



        Futbolcu messi = new Futbolcu("Messi","Barcelona",80,95,78);
        Futbolcu CR7 = new Futbolcu("CR7","Juventus",95,98,85);
        Futbolcu neymar = new Futbolcu("Neymar","PSG",78,95,65);
        Futbolcu Sabri = new Futbolcu("Sabri","Cincon",78,95,32);
        Futbolcu gabadinhoMhango = new Futbolcu("Gabadinho Mhango","Orlando Pirates",48,95,32);
        Futbolcu stefanNutz = new Futbolcu("Stefan Nutz","SV Ried",78,95,64);
        Futbolcu gokhanTore = new Futbolcu("Gökhan Töre","Sekiztaş",79,95,64);
        Futbolcu Alex = new Futbolcu("Alex","FB",97,65,78);
        Futbolcu futbolcu = new Futbolcu();

        Basketbolcu kobeBryant = new Basketbolcu("Kobe Bryant","Lakers",79,95,94);
        Basketbolcu LBJ = new Basketbolcu("LBJ","Lakers",94,98,78);
        Basketbolcu rayAllen = new Basketbolcu("Ray Allen","Miami",78,95,95);
        Basketbolcu swaggyP = new Basketbolcu("SwaggyP","Lakers",78,95,78);
        Basketbolcu pauGasol = new Basketbolcu("Pau Gasol","Lakers",78,25,80);
        Basketbolcu larryBird = new Basketbolcu("Larry Bird","Boston",60,50,95);
        Basketbolcu mj = new Basketbolcu("MJ","Bulls",95,89,98);
        Basketbolcu melihMahmutoğlu = new Basketbolcu("Melih Mahmutoğlu","FB",100,100,100);
        Basketbolcu basketbolcu = new Basketbolcu();


        Oyuncu oyuncu = new Oyuncu();
        Bilgisayar bilgisayar = new Bilgisayar("PC","Bilgisayar",0);
        Kullanıcı kullanıcı = new Kullanıcı("İnsan","Kullanıcı",0);




        ArrayList<Futbolcu> futbolcular = new ArrayList<>();
        ArrayList<Basketbolcu> basketbolcular = new ArrayList<>();
        ArrayList<Basketbolcu> basketbolcular2 = new ArrayList<>();
        ArrayList<Basketbolcu> basketbolcular3 = new ArrayList<>();
        ArrayList<Futbolcu> futbolcular2 = new ArrayList<>();
        ArrayList<Futbolcu> futbolcular3 = new ArrayList<>();
        ArrayList<Integer> sayiTutucu = new ArrayList<>();
        ArrayList<Integer> sayiTutucu2 = new ArrayList<>();



        sayiTutucu.add(0,0);
        sayiTutucu.add(1,1);
        sayiTutucu.add(2,2);
        sayiTutucu.add(3,3);
        sayiTutucu.add(4,4);
        sayiTutucu.add(5,5);
        sayiTutucu.add(6,6);
        sayiTutucu.add(7,7);


        futbolcular.add(0,messi);
        futbolcular.add(1,CR7);
        futbolcular.add(2,neymar);
        futbolcular.add(3,gabadinhoMhango);
        futbolcular.add(4,gokhanTore);
        futbolcular.add(5,stefanNutz);
        futbolcular.add(6,Sabri);
        futbolcular.add(7,Alex);


        basketbolcular.add(0,kobeBryant);
        basketbolcular.add(1,LBJ);
        basketbolcular.add(2,rayAllen);
        basketbolcular.add(3,larryBird);
        basketbolcular.add(4,melihMahmutoğlu);
        basketbolcular.add(5,mj);
        basketbolcular.add(6,swaggyP);
        basketbolcular.add(7,pauGasol);



        Random rastgele = new Random();
        //int secim=0;
        //int k=0;
        //int t=0;
        //int rastgeleSayi4=0;
        //int rastgeleSayi5=0;
        //int rastgeleSayi6=0;
        int rastgeleSayi7=0;


        //0-8 Arası Rakamları Rastgele Ayırma
        for(int i=0;i<4;i++) {
            rastgeleSayi7=rastgele.nextInt(8-i);
            sayiTutucu2.add(i,sayiTutucu.get(rastgeleSayi7));
            sayiTutucu.remove(rastgeleSayi7);
        }


        //-----------------------------------------------
        //Rastgele Kart Dağıtma
        for(int i=0;i<4;i++) {
            basketbolcular2.add(i,basketbolcular.get(sayiTutucu2.get(i)));
            basketbolcular3.add(i,basketbolcular.get(sayiTutucu.get(i)));
            futbolcular2.add(i,futbolcular.get(sayiTutucu2.get(i)));
            futbolcular3.add(i,futbolcular.get(sayiTutucu.get(i)));
        }

        kullanıcı.setKartListesiBas(basketbolcular2);
        kullanıcı.setKartListesiFut(futbolcular2);
        bilgisayar.setKartListesiBas(basketbolcular3);
        bilgisayar.setKartListesiFut(futbolcular3);



        //Kullanıcının Kartlarının Özelliklerini Yazdırır
        for(int i=0;i<4;i++)
        {
            kulButtonsBas.get(i).setText("İsim :"+kullanıcı.getKartListesiBas(i).getSporcuIsim()+
                    "\nTakım :"+kullanıcı.getKartListesiBas(i).getSporcuTakim()+
                    "\nİkilik :"+kullanıcı.getKartListesiBas(i).getIkilik()+
                    "\nUcluk :"+kullanıcı.getKartListesiBas(i).getUcluk()+
                    "\nSerbest Atış :"+kullanıcı.getKartListesiBas(i).getSerbestAtis());

        }

        for(int i=0;i<4;i++)
        {
            kulButtonsFut.get(i).setText("İsim :"+kullanıcı.getKartListesiFut(i).getSporcuIsim()+
                    "\nTakım :"+kullanıcı.getKartListesiFut(i).getSporcuTakim()+
                    "\nPenalti :"+kullanıcı.getKartListesiFut(i).getPenalti()+
                    "\nSerVur :"+kullanıcı.getKartListesiFut(i).getSerbestVurus()+
                    "\nKKK :"+kullanıcı.getKartListesiFut(i).getKaleciKarsiKarsiya());

        }

        //Bilgisayarın Kartlarının Özelliklerini Yazdırır
        for(int i=0;i<4;i++)
        {
            bilButtonsBas.get(i).setText("İsim :"+bilgisayar.getKartListesiBas(i).getSporcuIsim()+
                    "\nTakım :"+bilgisayar.getKartListesiBas(i).getSporcuTakim()+
                    "\nİkilik :"+bilgisayar.getKartListesiBas(i).getIkilik()+
                    "\nUcluk :"+bilgisayar.getKartListesiBas(i).getUcluk()+
                    "\nSerbest Atış :"+bilgisayar.getKartListesiBas(i).getSerbestAtis());
            bilButtonsBas.get(i).setStyle("-fx-background-color: #000000; ");
            bilButtonsBas.get(i).setTextFill(BLACK);
        }

        for(int i=0;i<4;i++)
        {
            bilButtonsFut.get(i).setText("İsim :"+bilgisayar.getKartListesiFut(i).getSporcuIsim()+
                    "\nTakım :"+bilgisayar.getKartListesiFut(i).getSporcuTakim()+
                    "\nPenalti :"+bilgisayar.getKartListesiFut(i).getPenalti()+
                    "\nSerVur :"+bilgisayar.getKartListesiFut(i).getSerbestVurus()+
                    "\nKKK :"+bilgisayar.getKartListesiFut(i).getKaleciKarsiKarsiya());
            bilButtonsFut.get(i).setStyle("-fx-background-color: #000000; ");
            bilButtonsFut.get(i).setTextFill(BLACK);
        }
          kullanıcı.setSıra(0);
        Scene scene = new Scene(root);
        Timer timer = new Timer();
        bilgisayar.setBekleme(false);
        scene.getStylesheets().add(this.getClass().getResource("b.css").toExternalForm());

        //Kullanıcı Kartları Kendi İsteğiyle Seçerken Bu Çalışır(Eğer Basketbolsa)
        for (Button kulButon:kulButtonsBas) {

            kulButon.setOnAction(e->
            {


                if(kullanıcı.getKartListesiFut().size()==0)
                {
                    kullanıcı.setSıra(1);
                }
                if(kullanıcı.getSıra()%2==1&&!bilgisayar.isBekleme())
                {


                    int rastgeleSayi4=0,rastgeleSayi6=0,secim=0,t=0;
                    int kulIndeksBas = 0;
                    kulIndeksBas = kulButtonsBas.indexOf(kulButon);
                    rastgeleSayi6 = rastgele.nextInt((bilButtonsBas.size()));
                    bilgisayar.setBilgisayarsirasi(rastgeleSayi6);

                    scene.getStylesheets().remove(this.getClass().getResource("b.css").toExternalForm());
                    scene.getStylesheets().add(this.getClass().getResource("a.css").toExternalForm());


                    rastgeleSayi4 = rastgele.nextInt(4);
                    secim = rastgeleSayi4;


                    bilButtonsBas.get(rastgeleSayi6).setDisable(true);
                    bilButtonsBas.get(rastgeleSayi6).setStyle("-fx-base: f4f162");
                    bilButtonsBas.get(rastgeleSayi6).setTextFill(BLACK);
                    kulButon.setDisable(true);
                    kulButon.setStyle("-fx-base: f4f162");
                    kulButon.setTextFill(BLACK);
                    basketbolcu.setKartKullanildiMi(true);

                    if(secim==1){
                        secimLabel.setText("*****Seçim İkilik*****");
                        System.out.println("*****Seçim İkilik*****");
                        if(kullanıcı.getKartListesiBas(kulIndeksBas).getIkilik() > bilgisayar.getKartListesiBas(rastgeleSayi6).getIkilik()) {
                            kazanaLabel.setText("Kazanan ---> " + kullanıcı.getKartListesiBas(kulIndeksBas).getSporcuIsim());
                            kullanıcı.setSkor(10);
                            Kulpuan.setText("Puan:"+kullanıcı.skorGoster());
                            System.out.println("Kazanan ---> " + kullanıcı.getKartListesiBas(kulIndeksBas).getSporcuIsim());

                        }
                        else if(kullanıcı.getKartListesiBas(kulIndeksBas).getIkilik() < bilgisayar.getKartListesiBas(rastgeleSayi6).getIkilik()) {
                            kazanaLabel.setText("Kazanan ---> " + bilgisayar.getKartListesiBas(rastgeleSayi6).getSporcuIsim());
                            bilgisayar.setSkor(10);
                            Bilpuan.setText("Puan:"+bilgisayar.skorGoster());
                            System.out.println("Kazanan ---> " + bilgisayar.getKartListesiBas(rastgeleSayi6).getSporcuIsim());

                        }
                        else
                        {
                            kazanaLabel.setText("Güçler Eşit");
                            kulButon.setDisable(false);
                            bilButtonsBas.get(rastgeleSayi6).setDisable(false);

                            bilButtonsBas.get(rastgeleSayi6).setStyle("-fx-background-color: #ff0000; ");
                            bilButtonsBas.get(rastgeleSayi6).setTextFill(BLACK);
                            bilgisayar.setBekleme(true);
                            timer.schedule(new TimerTask() {
                                @Override
                                public void run() {
                                    bilButtonsBas.get(bilgisayar.getBilgisayarsirasi()).setStyle("-fx-background-color: #000000; ");
                                    bilButtonsBas.get(bilgisayar.getBilgisayarsirasi()).setTextFill(BLACK);
                                    bilgisayar.setBekleme(false);
                                }
                            },6000);
                            basketbolcu.setKartKullanildiMi(false);

                        }



                    }
                    else if(secim==2){
                        secimLabel.setText("*****Seçim Serbest Atış*****");
                        System.out.println("*****Seçim Serbest Atış");
                        if(kullanıcı.getKartListesiBas(kulIndeksBas).getSerbestAtis()> bilgisayar.getKartListesiBas(rastgeleSayi6).getSerbestAtis()) {
                            kazanaLabel.setText("Kazanan ---> " + kullanıcı.getKartListesiBas(kulIndeksBas).getSporcuIsim());
                            kullanıcı.setSkor(10);
                            Kulpuan.setText("Puan:"+kullanıcı.skorGoster());
                            System.out.println("Kazanan ---> " + kullanıcı.getKartListesiBas(kulIndeksBas).getSporcuIsim());

                        }
                        else if(kullanıcı.getKartListesiBas(kulIndeksBas).getSerbestAtis()< bilgisayar.getKartListesiBas(rastgeleSayi6).getSerbestAtis()) {
                            kazanaLabel.setText("Kazanan ---> " + bilgisayar.getKartListesiBas(rastgeleSayi6).getSporcuIsim());
                            bilgisayar.setSkor(10);
                            Bilpuan.setText("Puan:"+bilgisayar.skorGoster());
                            System.out.println("Kazanan ---> " + bilgisayar.getKartListesiBas(rastgeleSayi6).getSporcuIsim());

                        }
                        else
                        {
                            kazanaLabel.setText("Güçler Eşit");
                            kulButon.setDisable(false);
                            bilButtonsBas.get(rastgeleSayi6).setDisable(false);
                            bilButtonsBas.get(rastgeleSayi6).setStyle("-fx-background-color: #ff0000; ");
                            bilButtonsBas.get(rastgeleSayi6).setTextFill(BLACK);
                            bilgisayar.setBekleme(true);
                            timer.schedule(new TimerTask() {
                                @Override
                                public void run() {
                                    bilButtonsBas.get(bilgisayar.getBilgisayarsirasi()).setStyle("-fx-background-color: #000000; ");
                                    bilButtonsBas.get(bilgisayar.getBilgisayarsirasi()).setTextFill(BLACK);
                                    bilgisayar.setBekleme(false);
                                }
                            },6000);
                           basketbolcu.setKartKullanildiMi(false);
                        }

                    }
                    else{
                        secimLabel.setText("*****Seçim Ucluk*****");
                        System.out.println("*****Seçim Ucluk*****");
                        if(kullanıcı.getKartListesiBas(kulIndeksBas).getUcluk()>bilgisayar.getKartListesiBas(rastgeleSayi6).getUcluk()) {
                            kazanaLabel.setText("Kazanan ---> " + kullanıcı.getKartListesiBas(kulIndeksBas).getSporcuIsim());
                            kullanıcı.setSkor(10);
                            Kulpuan.setText("Puan:"+kullanıcı.skorGoster());
                            System.out.println("Kazanan ---> " + kullanıcı.getKartListesiBas(kulIndeksBas).getSporcuIsim());
                        }
                        else if(kullanıcı.getKartListesiBas(kulIndeksBas).getUcluk()< bilgisayar.getKartListesiBas(rastgeleSayi6).getUcluk()) {
                            kazanaLabel.setText("Kazanan ---> " + bilgisayar.getKartListesiBas(rastgeleSayi6).getSporcuIsim());
                            bilgisayar.setSkor(10);
                            Bilpuan.setText("Puan:"+bilgisayar.skorGoster());
                            System.out.println("Kazanan ---> " + bilgisayar.getKartListesiBas(rastgeleSayi6).getSporcuIsim());
                        }
                        else
                        {
                            kazanaLabel.setText("Güçler Eşit");
                            kulButon.setDisable(false);
                            bilButtonsBas.get(rastgeleSayi6).setDisable(false);
                            bilButtonsBas.get(rastgeleSayi6).setStyle("-fx-background-color: #ff0000; ");
                            bilButtonsBas.get(rastgeleSayi6).setTextFill(BLACK);
                            bilgisayar.setBekleme(true);
                            timer.schedule(new TimerTask() {
                                @Override
                                public void run() {
                                    bilButtonsBas.get(bilgisayar.getBilgisayarsirasi()).setStyle("-fx-background-color: #000000; ");
                                    bilButtonsBas.get(bilgisayar.getBilgisayarsirasi()).setTextFill(BLACK);
                                    bilgisayar.setBekleme(false);
                                }
                            },6000);
                            basketbolcu.setKartKullanildiMi(false);
                        }

                    }

                    if ( basketbolcu.isKartKullanildiMi()&&!bilgisayar.isBekleme())
                    {
                        //Kullanılan Kartlar Çıkartılır
                        kullanıcı.getKartListesiBas().remove(kulIndeksBas);
                        bilgisayar.getKartListesiBas().remove(rastgeleSayi6);
                        // System.out.println("Kullanıcının Puanı :"+kullanıcı.skorGoster());
                        // System.out.println("PC Puanı :"+bilgisayar.skorGoster());
                        kulButtonsBas.remove(kulIndeksBas);
                        bilButtonsBas.remove(rastgeleSayi6);
                        if(kullanıcı.getKartListesiBas().size()==0&&kullanıcı.getKartListesiFut().size()==0)
                        {
                           if(kullanıcı.skorGoster()>bilgisayar.skorGoster())
                           {
                               kazanaLabel.setText("Kazanan:"+kullanıcı.getOyuncuAdi());
                           }
                           else if(kullanıcı.skorGoster()<bilgisayar.skorGoster())
                           {
                               kazanaLabel.setText("Kazanan:"+bilgisayar.getOyuncuAdi());
                           }
                           else
                           {
                               kazanaLabel.setText("Beraberlik");
                           }
                        }
                    }
                    kullanıcı.setSıra(1);
                }



            });
        }

        //Kullanıcı Kartları Kendi İsteğiyle Seçerken Bu Çalışır(Eğer Futbolsa)
        for (Button kulButon:kulButtonsFut) {

            kulButon.setOnAction(e->
            {


               if (kullanıcı.getKartListesiBas().size()==0)
               {
                   kullanıcı.setSıra(1);
               }
               if (kullanıcı.getSıra()%2==0&&!bilgisayar.isBekleme())
               {

                  futbolcu.setKartKullanildiMi(true);
                   int rastgeleSayi4=0,rastgeleSayi6=0,secim=0,k=0;
                   int kulIndexFut = 0;
                   kulIndexFut = kulButtonsFut.indexOf(kulButon);
                   rastgeleSayi6 = rastgele.nextInt((bilButtonsFut.size()));
                   bilgisayar.setBilgisayarsirasi(rastgeleSayi6);
                   scene.getStylesheets().remove(this.getClass().getResource("a.css").toExternalForm());
                   scene.getStylesheets().add(this.getClass().getResource("b.css").toExternalForm());

                   rastgeleSayi4 = rastgele.nextInt(4);
                   secim = rastgeleSayi4;

                   bilButtonsFut.get(rastgeleSayi6).setDisable(true);
                   bilButtonsFut.get(rastgeleSayi6).setStyle("-fx-base: f4f162");
                   bilButtonsFut.get(rastgeleSayi6).setTextFill(BLACK);

                   kulButon.setDisable(true);
                   kulButon.setStyle("-fx-base: f4f162");
                   kulButon.setTextFill(BLACK);


                   if(secim==1){
                       secimLabel.setText("*****Seçim Penaltı*****");
                       if(kullanıcı.getKartListesiFut(kulIndexFut).getPenalti()>bilgisayar.getKartListesiFut(rastgeleSayi6).getPenalti()) {
                           kazanaLabel.setText("Kazanan ---> " + kullanıcı.getKartListesiFut(kulIndexFut).getSporcuIsim());
                           kullanıcı.setSkor(10);
                           Kulpuan.setText("Puan:"+kullanıcı.skorGoster());
                           System.out.println(kullanıcı.skorGoster());
                           System.out.println(bilgisayar.skorGoster());
                       }
                       else if(kullanıcı.getKartListesiFut(kulIndexFut).getPenalti()<bilgisayar.getKartListesiFut(rastgeleSayi6).getPenalti()) {
                           kazanaLabel.setText("Kazanan ---> " + bilgisayar.getKartListesiFut(rastgeleSayi6).getSporcuIsim());
                           bilgisayar.setSkor(10);
                           Bilpuan.setText("Puan:"+bilgisayar.skorGoster());
                           System.out.println(kullanıcı.skorGoster());
                           System.out.println(bilgisayar.skorGoster());
                       }
                       else
                       {
                           kazanaLabel.setText("Güçler Eşit");
                           kulButon.setDisable(false);
                           bilButtonsFut.get(rastgeleSayi6).setDisable(false);
                           bilButtonsFut.get(rastgeleSayi6).setStyle("-fx-background-color: #ff0000; ");
                           bilButtonsFut.get(rastgeleSayi6).setTextFill(BLACK);
                           bilgisayar.setBekleme(true);
                           timer.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   bilButtonsFut.get(bilgisayar.getBilgisayarsirasi()).setStyle("-fx-background-color: #000000; ");
                                   bilButtonsFut.get(bilgisayar.getBilgisayarsirasi()).setTextFill(BLACK);
                                   bilgisayar.setBekleme(false);
                               }
                           },6000);
                           futbolcu.setKartKullanildiMi(false);
                       }



                   }
                   else if(secim==2){
                       secimLabel.setText("*****Seçim Serbest Vuruş*****");
                       if(kullanıcı.getKartListesiFut(kulIndexFut).getSerbestVurus() > bilgisayar.getKartListesiFut(rastgeleSayi6).getSerbestVurus()) {
                           kazanaLabel.setText("Kazanan ---> " + kullanıcı.getKartListesiFut(kulIndexFut).getSporcuIsim());
                           kullanıcı.setSkor(10);
                           Kulpuan.setText("Puan:"+kullanıcı.skorGoster());
                           System.out.println(kullanıcı.skorGoster());
                           System.out.println(bilgisayar.skorGoster());
                       }
                       else if(kullanıcı.getKartListesiFut(kulIndexFut).getSerbestVurus() < bilgisayar.getKartListesiFut(rastgeleSayi6).getSerbestVurus()) {
                           kazanaLabel.setText("Kazanan ---> " + bilgisayar.getKartListesiFut(rastgeleSayi6).getSporcuIsim());
                           bilgisayar.setSkor(10);
                           Bilpuan.setText("Puan:"+bilgisayar.skorGoster());
                           System.out.println(kullanıcı.skorGoster());
                           System.out.println(bilgisayar.skorGoster());
                       }
                       else
                       {
                           kazanaLabel.setText("Güçler Eşit");
                           kulButon.setDisable(false);
                           bilButtonsFut.get(rastgeleSayi6).setDisable(false);
                           bilButtonsFut.get(rastgeleSayi6).setStyle("-fx-background-color: #ff0000; ");
                           bilButtonsFut.get(rastgeleSayi6).setTextFill(BLACK);
                           bilgisayar.setBekleme(true);
                           timer.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   bilButtonsFut.get(bilgisayar.getBilgisayarsirasi()).setStyle("-fx-background-color: #000000; ");
                                   bilButtonsFut.get(bilgisayar.getBilgisayarsirasi()).setTextFill(BLACK);
                                   bilgisayar.setBekleme(false);
                               }
                           },6000);
                           futbolcu.setKartKullanildiMi(false);
                       }


                   }
                   else{
                       secimLabel.setText("*****Seçim KKK*****");
                       if(kullanıcı.getKartListesiFut(kulIndexFut).getKaleciKarsiKarsiya() > bilgisayar.getKartListesiFut(rastgeleSayi6).getKaleciKarsiKarsiya()) {
                           kazanaLabel.setText("Kazanan ---> " + kullanıcı.getKartListesiFut(kulIndexFut).getSporcuIsim());
                           kullanıcı.setSkor(10);
                           Kulpuan.setText("Puan:"+kullanıcı.skorGoster());
                           System.out.println(kullanıcı.skorGoster());
                           System.out.println(bilgisayar.skorGoster());
                       }
                       else if(kullanıcı.getKartListesiFut(kulIndexFut).getKaleciKarsiKarsiya() < bilgisayar.getKartListesiFut(rastgeleSayi6).getKaleciKarsiKarsiya()) {
                           kazanaLabel.setText("Kazanan ---> " + bilgisayar.getKartListesiFut(rastgeleSayi6).getSporcuIsim());
                           bilgisayar.setSkor(10);
                           Bilpuan.setText("Puan:"+bilgisayar.skorGoster());
                           System.out.println(kullanıcı.skorGoster());
                           System.out.println(bilgisayar.skorGoster());
                       }
                       else
                       {
                           kazanaLabel.setText("Güçler Eşit");
                           kulButon.setDisable(false);
                           bilButtonsFut.get(rastgeleSayi6).setDisable(false);
                           bilButtonsFut.get(rastgeleSayi6).setStyle("-fx-background-color: #ff0000; ");
                           bilButtonsFut.get(rastgeleSayi6).setTextFill(BLACK);
                           bilgisayar.setBekleme(true);
                           timer.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   bilButtonsFut.get(bilgisayar.getBilgisayarsirasi()).setStyle("-fx-background-color: #000000; ");
                                   bilButtonsFut.get(bilgisayar.getBilgisayarsirasi()).setTextFill(BLACK);
                                   bilgisayar.setBekleme(false);
                               }
                           },6000);
                           futbolcu.setKartKullanildiMi(false);
                       }


                   }
                   if (futbolcu.isKartKullanildiMi()&&!bilgisayar.isBekleme())
                   {
                       //Kullanılan Kartlar Çıkartılır
                       kullanıcı.getKartListesiFut().remove(kulIndexFut);
                       bilgisayar.getKartListesiFut().remove(rastgeleSayi6);

                       kulButtonsFut.remove(kulIndexFut);
                       bilButtonsFut.remove(rastgeleSayi6);
                       if(kullanıcı.getKartListesiBas().size()==0&&kullanıcı.getKartListesiFut().size()==0)
                       {
                           if(kullanıcı.skorGoster()>bilgisayar.skorGoster())
                           {
                               kazanaLabel.setText("Kazanan:"+kullanıcı.getOyuncuAdi());
                           }
                           else if(kullanıcı.skorGoster()<bilgisayar.skorGoster())
                           {
                               kazanaLabel.setText("Kazanan:"+bilgisayar.getOyuncuAdi());
                           }
                           else
                           {
                               kazanaLabel.setText("Beraberlik");
                           }
                       }
                   }
                   kullanıcı.setSıra(1);
               }
            });

        }

        primaryStage.setScene(scene);

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);


    }


}