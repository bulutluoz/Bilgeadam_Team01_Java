package day13_exceptions_collections;

import java.util.Scanner;

public class C04_ThrowException {

    public static void main(String[] args) {

        // throw komutu kontolumuz icerisinde
        // bilerek ve isteyerek exception olusturmamizi saglar
        //  - kullaniciya daha guclu bir hata mesaji vermek
        //  - bir durum gerceklestiginde bazi satirlarin atlanmasini saglamak
        //  - kod'un calismasini durdurmak icin kullanabiliriz

        // kullanicidan yasini isteyin
        // kullanici negatif bir deger girerse guclu bir hata mesaji verelim

        Scanner scanner = new Scanner(System.in);
        System.out.println("yasinizi giriniz...");
        int yas = scanner.nextInt();

        /*
        if (yas < 0){
            // System.out.println("Yas negatif olamaz");
            throw new IllegalArgumentException("Yas negatif olamaz");
        }

         */

        // kullanicidan yasini isteyin
        // kullanici negatif bir deger girerse kodun belirli bir bolumunu atlayalim

        if(yas< 0){
            throw new IllegalArgumentException();
        }
        yas  = yas + 5;

        if(yas > 65){
            System.out.println("Emekli olabilir");
        }



    }
}
