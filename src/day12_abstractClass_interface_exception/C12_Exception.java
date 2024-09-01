package day12_abstractClass_interface_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_Exception {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyin
        // ve 2 katini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");

        int girilenSayi = 0;

        try {

            girilenSayi = scanner.nextInt();
            // kullanici tamsayi olmayan bir deger girebilir
            // InputMismatchException
            System.out.println("sayinin 2 kati : " + 2 * girilenSayi);

        } catch (InputMismatchException e) {

            // System.out.println("Tamsayi girmeniz gerekir");
            // System.out.println(e.getMessage()); // null
            // System.out.println(e.getCause()); // null
            e.printStackTrace();
            /*
            java.util.InputMismatchException
            at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            at java.base/java.util.Scanner.next(Scanner.java:1594)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            at day12_abstractClass_interface_exception.C12_Exception.main(C12_Exception.java:21)
             */

            // try blogunda exception olusup
            // catch ile yakalanip kontrol altina alindiktan sonra
            // catch blogundaki kodlar calisir
            // bu kodlar kendi istedigimiz bir mesaj olabilir,
            //           Java'nin e objesine kaydettigi hatayi yazdirabiliriz veya
            //           hata mesaji olmadan calismasi gereken baska kodlar calistirilabilir

        }

        System.out.println("Kod boyle yazilir");
    }
}
