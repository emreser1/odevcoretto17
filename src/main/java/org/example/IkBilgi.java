package org.example;

public class IkBilgi {
    public static void main(String[] args) {

        OdevIk personel1 = new OdevIk();
        OdevIk personel2 = new OdevIk();

        personel1.isim = "emre";
        personel1.soyisim = "eser";
        personel1.gorev = "testçi";
        personel1.yas = 27 ;

        personel2.isim = "furkan";
        personel2.soyisim = "mermer";
        personel2.gorev = "backend";
        personel2.yas = 27;


        personel1.gorev();
        personel1.yas();

        personel2.gorev();
        personel2.yas();








    }

    }
