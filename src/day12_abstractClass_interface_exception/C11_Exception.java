package day12_abstractClass_interface_exception;

import java.util.Scanner;

public class C11_Exception {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // 1.sayiyi 2.sayiya bolup
        // sonucun tamsayi  kismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. tamsayiyi giriniz...");
        int sayi1 = scanner.nextInt();

        System.out.println("2. tamsayiyi giriniz...");
        int sayi2 = scanner.nextInt();

        if (sayi2 == 0){
            System.out.println("Sayi2 0 Olamaz");
        }else{
            System.out.println(  "Sayilarin bolum sonucu : " +   sayi1 / sayi2 );
        }

        System.out.println("Kod boyle yazilir....");

    }
}
