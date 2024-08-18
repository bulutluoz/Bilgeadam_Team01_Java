package day08_passByValue_ImmutableClasses_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C10_LocalTime {
    public static void main(String[] args) {

        LocalTime simdi = LocalTime.now();
        // canli bir saat degildir
        // sadece 8.satirdaki kodun calistigi zamani bilgisayarimizdan alip kaydeder

        System.out.println(simdi); // 11:30:17.251490

        LocalTime baslangic = LocalTime.now();
        System.out.println(baslangic);
        System.out.println("baslangic nano : "+ baslangic.toNanoOfDay());
        System.out.println("baslangic saniye : "+ baslangic.toSecondOfDay());

        for (int i = 0; i <100000000 ; i++) {
            String str = i + " " ;
        }

        LocalTime bitis  = LocalTime.now();
        System.out.println(bitis);
        System.out.println("bitis nano : "+ bitis.toNanoOfDay());
        System.out.println("bitis saniye : "+ bitis.toSecondOfDay());

        System.out.println("sure saniye olarak : " + (bitis.toSecondOfDay() - baslangic.toSecondOfDay()) );
        System.out.println("sure nanosaniye olarak : " + (bitis.toNanoOfDay() - baslangic.toNanoOfDay()));

        // baska timezone'lardaki zamani yazdiralim

        System.out.println(  LocalTime.now(ZoneId.of("America/New_York"))  ); // 05:42:48.150361
        System.out.println( LocalTime.now(ZoneId.of("Asia/Tokyo"))); // 18:43:32.694416

        System.out.println(simdi.withSecond(0).withNano(0)); // 11:44


    }
}
