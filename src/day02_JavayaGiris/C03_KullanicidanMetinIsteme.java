package day02_JavayaGiris;

import java.util.Scanner;

public class C03_KullanicidanMetinIsteme {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini ayri ayri isteyip
        // buyuk harflerle ALI CAN seklinde yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");

        String girilenIsim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");

        String girilenSoyisim = scan.nextLine();

        System.out.println(girilenIsim.toUpperCase()+ " " + girilenSoyisim.toUpperCase());
    }
}
