package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C01_Varargs {

    public static void main(String[] args) {
        /*
            java'da bir method call yapilirken
            farkli sayilarda argument kullanilacaksa
            her argument sayisi icin ayri bir method olusturmak yerine
            Varargs(variety of orguments) kullanilabilir
         */

        // verilen iki tamsayiyi toplayip yazdiran bir method olusturun
        topla(3,4); // Sayilarin toplami : 7

        topla(3,4,5); // Sayilarin toplami : 12

        topla(4,5,6,7); // sayilarin toplami : 22
        topla(1,2,3,4,5); // sayilarin toplami : 15
        topla(1,2,3,4,5,6); // sayilarin toplami : 21
        topla(1,2,3,4,5,6,7); // sayilarin toplami : 28
        topla(1,2,3,4,5,6,7,8,9,3,4,5,6,7,8,9,2,3,4,6,7); // 109

    }

    public static void topla( int sayi1 , int sayi2 ){

        System.out.println("Sayilarin toplami : " + (sayi1+sayi2));
    }

    public static void topla( int sayi1 , int sayi2 , int sayi3){

        System.out.println("Sayilarin toplami : " + (sayi1+sayi2+sayi3));
    }

    public static void topla(int... sayilar){
        // sayilar varargs'i argument olarak yollanan TUM sayilari alabilecek
        // bir ARRAY'dir
        int toplam= 0;

        for (int each : sayilar
             ) {
            toplam += each;
        }
        System.out.println("sayilarin toplami : " + toplam);
    }
}
