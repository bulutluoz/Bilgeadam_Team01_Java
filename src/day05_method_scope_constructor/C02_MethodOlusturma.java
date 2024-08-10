package day05_method_scope_constructor;

public class C02_MethodOlusturma {

    public static void main(String[] args) {

        // verilen 3 sayinin toplamini yazdiran bir method olusturun

        ucSayininToplaminiYazdir(4,5,6); // Verilen sayilarin toplami : 15

        ucSayininToplaminiYazdir(-9,6,50); // Verilen sayilarin toplami : 47

        // ucSayininToplaminiYazdir(8.3,5,6); // parametreler ile verilen argumanlar uyumlu degil

        // ucSayininToplaminiYazdir("a","b","c"); parametreler ile verilen argumanlar uyumlu degil

        ucSayininToplaminiYazdir('a','b','c'); // Verilen sayilarin toplami : 294


    }

    public static void ucSayininToplaminiYazdir( int sayi1 , int sayi2, int sayi3  ){

        System.out.println("Verilen sayilarin toplami : " + (sayi1+sayi2+sayi3));
    }

}
