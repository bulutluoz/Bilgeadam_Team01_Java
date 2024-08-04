package day04_Cover;

import java.util.Scanner;

public class C04_IfEleseIfStatements {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz...");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu cm olarak giriniz..");
        double boy = scanner.nextDouble();

        double vke = (kilo*10000 / (boy *boy));

        System.out.println("Vucut kitle endeksiniz : " + vke);




        // 20’den kucukse zayif yazdirin.

        if (vke > 30){ // vucut kitle endeksi 30’dan buyukse obez,
            System.out.println("Durumunuz : Obez");
        } else if (vke >25){ // 25-30 arasi ise kilolu,
            System.out.println("Durumunuz : Kilolu");
        } else if (vke > 20){ // 20-25 arasi ise normal,
            System.out.println("Durumunuz : Normal");
        } else { // 20’den kucukse zayif yazdirin.
            System.out.println("Durumunuz : Zayif");
        }


    }
}
