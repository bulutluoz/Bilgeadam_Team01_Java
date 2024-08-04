package day04_Cover;

import java.util.Scanner;

public class C02_BagimsizIfCumleleri_Flag {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin
        // eger sayi asagidaki sartlari saglamazsa, hatalari soyleyin
        // sayi butun sartlari sagliyorsa
        // konsolda "Mukemmel Sayi"
        // 1- sayi pozitif olmalidir
        // 2- sayi cift olmalidir
        // 3- sayi 3 ile bolunememelidir
        // 4- sayi 5 in katlarindan 1 fazla olmalidir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        int flag = 10;

        // 1- sayi pozitif olmalidir

        if ( ! (girilenSayi > 0)){
            System.out.println("Sayi pozitif olmalidir");
            flag = 20;
        }

        // 2- sayi cift olmalidir

        if ( !(girilenSayi % 2 == 0) ){
            System.out.println("Sayi cift sayi olmalidir");
            flag = 20;
        }

        // 3- sayi 3 ile bolunememelidir

        if (  girilenSayi % 3 == 0 ){
            System.out.println("Sayi 3'e bolunememelidir");
            flag = 20;
        }

        // 4- sayi 5 in katlarindan 1 fazla olmalidir

        if ( ! (girilenSayi % 5 == 1) ){
            System.out.println("Girilen sayi 5'in katlarindan 1 fazla olmalidir");
            flag = 20;
        }


        if (flag == 10){ // hic hata bulunamadigi icin, sayac 20 olmadi
            System.out.println("Mukemmel sayi");
        }

    }
}
