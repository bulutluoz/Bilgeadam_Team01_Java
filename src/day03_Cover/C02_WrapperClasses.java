package day03_Cover;

public class C02_WrapperClasses {

    public static void main(String[] args) {

        // primitive data turleri
        boolean bl = true;
        char chr = 'a';
        byte byt = 2;
        short shrt = 34;
        int int1 = 456;
        long lng = 56;
        float flt = 45.6f;
        double dbl = 45.7;

        // non-primitive
        String str = "Java candir";

        System.out.println(str.length()); // 11
        System.out.println(str.contains("a")); // true
        System.out.println(str.contains("j")); // false
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // java candir

        // primitive data turlerinin hazir method'lari yoktur
        // Java primitive data turleri ile hazir method'lar kullanabilmemiz icin
        // primitive data turlerinin non-primitive versiyonlarini hazirlamistir
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        Character chr2 = '4';
        Integer sayi = 56;

        // Integer Wrapper class ile ilgili bilmemiz gereken en onemli ozellikler

        System.out.println("Integer'in alacagi en buyuk deger : " + Integer.MAX_VALUE);
        // Integer'in alacagi en buyuk deger : 2147483647

        String fiyat1 = "56";
        String fiyat2 = "67";

        // fiyat1 ile fiyat2'nin toplaminin 100'den buyuk oldugunu test edin

        System.out.println(fiyat1 + fiyat2); // 5667

        System.out.println(Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2)); // 123

        // Character wrapper class

        char chr3 = 'a';
        char chr4 = '5';
        char chr5 = 'K';

        System.out.println(Character.isDigit(chr3)); // false
        System.out.println(Character.isDigit(chr4)); // true
        System.out.println(Character.toUpperCase(chr3)); // A
        System.out.println(Character.isUpperCase(chr3));// false
        System.out.println(Character.isUpperCase(chr5)); // true

    }
}
