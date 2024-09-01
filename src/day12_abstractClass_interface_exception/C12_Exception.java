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

            System.out.println("Tamsayi girmeniz gerekir");
        }

        System.out.println("Kod boyle yazilir");
    }
}
