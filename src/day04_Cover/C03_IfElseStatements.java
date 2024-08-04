package day04_Cover;

import java.util.Scanner;

public class C03_IfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char girilenKarakter = scanner.next().charAt(0);
        // scanner.nextChar() method'u olmadigindan
        // once scnner.next() veya scnner.nextLine() ile String olarak alip
        // scnner.next().charAt() ile istenen index'deki karakteri alabiliriz


        // 1- ASCII table kullanarak
        //    Eger girilen karakter A ile Z arasinda ise, girilen harf buyuk harftir

        if (  'A' <= girilenKarakter  &&  girilenKarakter <= 'Z'     ){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

        // 2- Character wrapper class'indan hazir method kullanabilirim


        if ( Character.isUpperCase(girilenKarakter) ){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

    }
}
