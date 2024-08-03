package day03_Cover;

public class C03_MatematikselIslemler {
    public static void main(String[] args) {

        // % islemi bolme islemi sonucundaki kalani verir

        System.out.println( 25 % 5 ); // 0
        System.out.println( 27 % 5 ); // 2

        int sayi = 235;
        System.out.println(sayi % 2); // 0 ise cift sayidir, 1 ise tek sayidir

        // verilen sayinin birler basamagini bulun
        System.out.println(sayi % 10); // 5


        // bolme isleminde bolunen sayi ve bolen sayi int ise
        // sonucu tamsayi olarak verir

        System.out.println( 25 / 8 ); // 3

        int sayi1 = 20;
        int sayi2 = 6;

        // sayi1 / sayi2 degerini ondalikli olarak yazdirin

        System.out.println(sayi1 / sayi2); // 3,333333 ==> 3

        System.out.println( (double) (sayi1 / sayi2) ); // 3.0

        System.out.println(  sayi1 /(double) sayi2   ); // 3.3333333333333335
    }
}
