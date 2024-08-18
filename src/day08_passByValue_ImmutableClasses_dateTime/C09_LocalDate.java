package day08_passByValue_ImmutableClasses_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C09_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); //  2024-08-18

        LocalDate tarihUsa = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(tarihUsa); // 2024-08-18

        LocalDate tarihTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tarihTokyo); // 2024-08-18

        LocalDate iseBaslamaTarihi = LocalDate.of(2018,3,15);
        System.out.println(iseBaslamaTarihi); // 2018-03-15

        LocalDate dogumTarihi = LocalDate.of(2012,6,7);


        System.out.println(dogumTarihi.isBefore(iseBaslamaTarihi)); // true
        System.out.println(tarihTokyo.isAfter(tarihUsa)); // false

        System.out.println(tarih.getDayOfYear()); // 231
        System.out.println(tarih.getDayOfWeek()); // SUNDAY

        // Tarihi 18 Agustos 2024 seklinde yazdirin

        System.out.println(  tarih.getDayOfMonth() + " " +
                             tarih.getMonth()+ " " +
                             tarih.getYear()
                            ); // 18 AUGUST 2024
        // tarihte istedigimiz kadar ileriye veya geriye gidebiliriz
        System.out.println(tarih.plusYears(3).plusWeeks(7).plusDays(2)); // 2027-10-08
        System.out.println(tarih.minusDays(75)); // 2024-06-04

        // suanki tarihin sadece bir bolumunu istenen degerle degistirebiliriz

        System.out.println(tarih.withMonth(5)); // 2024-05-18

        System.out.println(tarih.isLeapYear()); // true

        // 1972 leap year mi ?

        LocalDate tarih72 = LocalDate.of(1972,1,1);
        System.out.println(tarih72.isLeapYear()); // true




    }
}
