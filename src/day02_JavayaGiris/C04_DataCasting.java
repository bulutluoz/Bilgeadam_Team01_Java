package day02_JavayaGiris;

public class C04_DataCasting {

    public static void main(String[] args) {

        /*
            1- boolean ==> true/false
            2- char ==> 'a' tek tirnak icinde tek karakter
            3,4,5,6- tamsayi ==> byte 127 , short 32bin , int 2milyar , long
            7,8- ondalikli sayilar ==> float, double

            9- non-primitive'lerden String ==> metin
         */

        boolean bl = true;
        char chr = 'w';
        byte byt = 20;
        short shrt = 23;
        int int1 = 12;
        long lng = 5;
        float flt = 3.4f;
        double dbl = 4.5;
        String str = "Java Candir";

        // casting bir variable'a kendi data turu disindaki bir degeri atamaktir

        // boolean ve String'e baska data turunden deger atayamazsiniz
        // bl = chr;
        // bl = int1;
        // bl = str;

        // str = bl;
        // str = chr;
        // str = lng;

        // sayi degerlerini kabul eden byte,short,int,long,float ve double
        // kendi aralarinda casting'e izin verirler
        // ANCAKKKK

        // byt = shrt;
        // byt = int1;
        // byt = lng;
        // byt = flt;
        // byt = dbl;

        // eger kucuk hacimli data turundeki DEGERI
        // daha buyuk hacimli VARIABLE'a atamak istersek
        // Java bunu otomatik olarak yapar , buna AUTO WIDENING denir
        dbl = byt;
        dbl = shrt;
        dbl = int1;
        dbl = lng;
        dbl = flt;


        // Eger tersini yapacaksak, yani
        // buyuk hacimli data turundeki DEGERI
        // daha kucuk hacimli VARIABLE'a atamak istersek
        // Java risk almamak icin bu islemi direkt yapmaz,
        // bizden sorumlulugu ustlenmemizi ister
        // sorumlulugu almak icin degerin onune parantez icinde cevirmek istedigimiz data turunu yazariz
        // Java bu durumda sonuclarina katlanacagimiz sekilde zorla da olsa casting yapar

        int1 = 14;

        byt = (byte)int1;

        System.out.println("int 14'un byte karsiligi : " + byt); // 14

        dbl = 30.5;

        byt = (byte)dbl;

        System.out.println("double 30.5'in byte karsiligi : " + byt); // 30

        shrt = 130;

        byt = (byte)shrt ;

        System.out.println("short 130'un byte karsiligi : " + byt); // -126













    }
}
