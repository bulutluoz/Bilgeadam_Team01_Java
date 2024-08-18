package day08_passByValue_ImmutableClasses_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C12_DateTimeFormatter {

    public static void main(String[] args) {

        // zaman ve tarih ile ayri ayri ugrasmak istemezsek

        LocalDateTime tarihBugun = LocalDateTime.now();

        System.out.println(tarihBugun); // 2024-08-18T12:11:26.435265

        // Tarih ve zamani istenen bir formatta kullanmak istersek

        DateTimeFormatter format1 = DateTimeFormatter.ISO_WEEK_DATE;

        System.out.println(tarihBugun.format(format1)); // 2024-W33-7

/*
            Eger tarih ve saati istediginiz bir form'da yazdirmak isterseniz
            once o formati String olarak olusturmalisiniz
            format olusturduktan sonra ldt'yi istenen formatla yazdirabilirsiniz

            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */


        //   18/08/2024 21:12
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(tarihBugun.format(format2)); // 18/08/2024 12:26


        //   18-8-24 SUNDAY
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd-M-yy EEEE");
        System.out.println(tarihBugun.format(format3)); // 18-8-24 Sunday


        //   5/7/24 9:12 PM

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("d/M/yy h:mm a");
        System.out.println(tarihBugun.format(format4)); // 18/8/24 12:30 PM


        //  2024 221 SUNDAY

        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("yyyy DDD EEEE");
        System.out.println(tarihBugun.format(format5)); // 2024 231 Sunday




    }
}
