package day04_Cover;

import java.util.Scanner;

public class C05_NestedIfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        // Kullanicidan cinsiyetini ve yasini alin,
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E: Erkek, K: Kadin");
        char cinsiyet = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz..");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'K' && yas >= 60 ){
            System.out.println("Kadin, 60 yasindan buyuk oldugu icin emekli olabilir");
        } else if (cinsiyet == 'K' && yas<60){
            System.out.println("Kadin,emekli olmak icin " + (60-yas) + " yil daha calismalidir");
        } else if (cinsiyet == 'E' && yas>=65) {
            System.out.println("Erkek, 65 yasindan buyuk oldugu icin emekli olabilir");
        } else if (cinsiyet == 'E' && yas<65) {
            System.out.println("Erkek,emekli olmak icin " + (65-yas) + " yil daha calismalidir");
        } else {
            System.out.println("Bilgilerde yanlislik var");
        }


        // Eger degisken birden fazla ise
        // Kodun daha anlasilir ve daha kontrol edilebilir olmasi icin
        // Nested(ic ice) if else kullanabiliriz
        // bizim bu gorevde 2 degiskenimiz var 1- cinsiyet, 2-yas
        // Nested yapmak icin once bir degiskeni ana degisken kabul edip
        // ona gore if else... olusturuyoruz
        // bu gorevde cinsiyet ana degisken olsun


        if (cinsiyet == 'K'){ // bu body'ye K suzgecinde yakalananlar gelecek

            if (yas<20 || yas>80){
                System.out.println("Bu yaslar icin emeklilik hesaplamiyoruz");
            } else if (yas >=60) {
                System.out.println("Kadin, 60 yasindan buyuk oldugu icin emekli olabilir");
            } else
                System.out.println("Kadin,emekli olmak icin " + (60-yas) + " yil daha calismalidir");

        } else if (cinsiyet == 'E') { // bu body'ye E suzgecinde yakalananlar gelecek
            if (yas<20 || yas>80){
                System.out.println("Bu yaslar icin emeklilik hesaplamiyoruz");
            } else if (yas >=65) {
                System.out.println("Erkek, 65 yasindan buyuk oldugu icin emekli olabilir");
            } else
                System.out.println("Erkek, emekli olmak icin " + (65-yas) + " yil daha calismalidir");

        } else {
            System.out.println("Cinsiyet girisi hatali, E: Erkek, K: Kadin seciniz ");
        }


    }
}
