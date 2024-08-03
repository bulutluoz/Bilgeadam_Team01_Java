package day03_Cover;

public class C05_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int sayi = 10;

        //  sayi++ veya ++sayi yazildigi satirda tek basina kullanilmissa ayni islemi yaparlar

        System.out.println("11.satirda sayi : " + sayi); // 10

        sayi++;

        System.out.println("15.satirda sayi : " + sayi); // 11

        ++sayi;

        System.out.println("19.satirda sayi : " + sayi); // 12

        // aralarindaki fark kullanildigi satirda tek basina olmazsa ortaya cikar

        System.out.println(  ++sayi ); //13

        System.out.println("25.satirda sayi : " + sayi); // 13

        System.out.println( sayi++ ); // 13

        System.out.println("29.satirda sayi : " + sayi); // 14

        int a = 5;
        int b = 8;

        int c = --a + b;

        System.out.println( a + ", " + b + ", " + c);
        // 4, 8, 12

        c= a + b--;


        System.out.println( a + ", " + b + ", " + c);
        //4, 7, 12














    }
}
