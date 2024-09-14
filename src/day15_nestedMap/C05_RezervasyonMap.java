package day15_nestedMap;

import java.util.HashMap;
import java.util.Map;

public class C05_RezervasyonMap {

    public static void main(String[] args) {

        /*
                asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi"
            }
         */
        // API'lar data alisverisi icin standart hale getirdikleri yapilar kullanirlar
        // EGER bu datalari Java kullanarak iletmek isterseniz
        // kullanabilecegimiz en uygun yapi Map olacaktir

        // Bir tester olarak bizim api ile yapacagimiz islem
        // boyle bir data parcacigi olusturmak
        // veya bu datadan istenilen bilgileri alip kontrol etmek olacaktir

        Map<String,Object> rezervasyonMapi = new HashMap<>();

        rezervasyonMapi.put("firstname","Ahmet");
        rezervasyonMapi.put("lastname","Bulut");
        rezervasyonMapi.put("totalprice",500);
        rezervasyonMapi.put("depositpaid", false);

        Map<String,String> bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        rezervasyonMapi.put("bookingdates",bookingdatesValueMap);
        rezervasyonMapi.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMapi);

        /*
            {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                bookingdates={
                                checkin=2024-07-21,
                                checkout=2024-08-10
                                },
               totalprice=500,
               depositpaid=false,
               lastname=Bulut
               }

         */

        // rezervasyon map'indeki checkin tarihini yazdirin

        System.out.println(rezervasyonMapi.get("checkin")); // null
        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkin"));
        // 2024-07-21

        // rezervasyon map'indeki totalprice degerini yazdirin
        System.out.println(rezervasyonMapi.get("totalprice")); // 500


        // rezervasyon map'indeki ismi yazdirin

        System.out.println(rezervasyonMapi.get("firstname")); // Ahmet

    }
}
