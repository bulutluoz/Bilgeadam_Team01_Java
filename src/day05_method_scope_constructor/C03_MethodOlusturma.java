package day05_method_scope_constructor;

public class C03_MethodOlusturma {
    public static void main(String[] args) {

        // verilen iki tamsayidan kucuk olmayani donduren bir method olusturun

        kucukOlmayaniDondur(23,56);

        System.out.println(   kucukOlmayaniDondur(34, 37)   );

        int sonuc = kucukOlmayaniDondur(23,43);

        System.out.println("sonuc : " + sonuc); // sonuc : 43


    }


    public static int kucukOlmayaniDondur( int sayi1, int sayi2   ){

        int kucukOlmayanSayi = 0;

        if (sayi1 > sayi2){

            kucukOlmayanSayi = sayi1;

        }else {

            kucukOlmayanSayi = sayi2;
        }

        return kucukOlmayanSayi;
    }
}
