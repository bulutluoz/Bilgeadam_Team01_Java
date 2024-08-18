package day08_passByValue_ImmutableClasses_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C11_istenenZamanKadarKodlariBekletme {

    public static void main(String[] args) throws InterruptedException {


        // kodu 3 saniye bekletmek istiyoruz

        LocalTime baslangic = LocalTime.now();
        System.out.println(baslangic); //

        /*
        long baslangicSaniye = baslangic.toSecondOfDay();
        long beklemeSuresiSaniye = 0 ;


        while (beklemeSuresiSaniye != 3){

            LocalTime simdi = LocalTime.now();

            if (simdi.toSecondOfDay() - baslangicSaniye == 3){
                break;
            }

        }

         */

        Thread.sleep(3000);

        LocalTime bitis = LocalTime.now();
        System.out.println(bitis);


    }
}
