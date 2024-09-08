package day14_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_MapOlusturma {

    public static void main(String[] args) {

        // Map'i olusturmadan once Key ve Value'nun neler olacagini belirlemis olmaliyiz

        Map<Integer , String> ogrenciMap = new TreeMap<>() ;

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        /*
            {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
                }
         */

        System.out.println(ogrenciMap.keySet());
        // Set olarak tum key'leri verir
        // [101, 102, 103, 104, 105, 106, 107]

        // ogrenci map'inde 103 numarali bir ogrenci var mi ?

        System.out.println(ogrenciMap.containsKey(103)); // true
        System.out.println(ogrenciMap.containsKey(113)); // true


        System.out.println(ogrenciMap.values());

        /*
            String'lerden olusan bir Collection olarak tum value'leri verir

            [ Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF,
              Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]
         */

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value'leri gozden gecirir ve degeri "Ali" olan bir value var mi diye kontrol eder
        // value'nun icindeki kelime, harf veya karakterlere degil
        // bir butun olarak value'ye bakar

        System.out.println(ogrenciMap.containsValue("Sevgi-Can-10-K-MF")); // true



    }
}
