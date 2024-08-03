package day02_JavayaGiris;

import java.util.Scanner;

public class C02_KullanicidanDegerAlma {

    public static void main(String[] args) {

        // Kullanicidan deger almak icin Scanner kulanilir

        // 1. adim bir scanner objesi olusturmak
        Scanner scanner = new Scanner(System.in);

        // 2. kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen 4 rakamdan olusan sifrenizi giriniz...");

        // 3. kullanicidan alacagimiz dataya uygun bir variable olusturup
        //    kullanicidan bilgiyi next... () method'lari ile alip variable'a kaydederiz

        int girilenSifre = scanner.nextInt();

        System.out.println("Girdiginiz sifre : " + girilenSifre);



    }
}
