package day04_Cover;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri_Sayac {

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

        int sayac = 0;

        // 1- sayi pozitif olmalidir

        if ( ! (girilenSayi > 0)){
            System.out.println("Sayi pozitif olmalidir");
            sayac++;
        }

        // 2- sayi cift olmalidir

        if ( !(girilenSayi % 2 == 0) ){
            System.out.println("Sayi cift sayi olmalidir");
            sayac++;
        }

        // 3- sayi 3 ile bolunememelidir

        if (  girilenSayi % 3 == 0 ){
            System.out.println("Sayi 3'e bolunememelidir");
            sayac++;
        }

        // 4- sayi 5 in katlarindan 1 fazla olmalidir

        if ( ! (girilenSayi % 5 == 1) ){
            System.out.println("Girilen sayi 5'in katlarindan 1 fazla olmalidir");
            sayac++;
        }


        if (sayac == 0){ // hic hata bulunamadigi icin, sayac hic artmadi
            System.out.println("Mukemmel sayi");
        }


    }
}
