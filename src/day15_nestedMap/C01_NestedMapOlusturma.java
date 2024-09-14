package day15_nestedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_NestedMapOlusturma {

    public static void main(String[] args) {

        /*
            ogrenciMap.put(101,"Ali-Can-11-H-MF");
            ogrenciMap.put(102,"Veli-Cem-10-K-TM");
            ogrenciMap.put(103,"Ali-Cem-11-K-TM");
         */

        // ogrenci101ValueMap isim=Ali, soyisim=Can, sinif=11, sube=H, bolum=MF


        Map<String,String> ogrenci101valueMap = new TreeMap<>();
        ogrenci101valueMap.put("isim","Ali");
        ogrenci101valueMap.put("soyisim","Can");
        ogrenci101valueMap.put("sinif","11");
        ogrenci101valueMap.put("sube","H");
        ogrenci101valueMap.put("bolum","MF");

        Map<String,String> ogrenci102valueMap = new TreeMap<>();
        ogrenci102valueMap.put("isim","Veli");
        ogrenci102valueMap.put("soyisim","Cem");
        ogrenci102valueMap.put("sinif","10");
        ogrenci102valueMap.put("sube","K");
        ogrenci102valueMap.put("bolum","TM");

        Map<String,String> ogrenci103valueMap = new TreeMap<>();
        ogrenci103valueMap.put("isim","Ali");
        ogrenci103valueMap.put("soyisim","Cem");
        ogrenci103valueMap.put("sinif","11");
        ogrenci103valueMap.put("sube","K");
        ogrenci103valueMap.put("bolum","TM");

        Map<Integer, Map<String,String>> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,ogrenci101valueMap);
        ogrenciMap.put(102,ogrenci102valueMap);
        ogrenciMap.put(103,ogrenci103valueMap);

        // ogrenci map'ini yazdiralim
        System.out.println(ogrenciMap);

        /*
            {
               101={bolum=MF, isim=Ali, sinif=11, soyisim=Can, sube=H},
               102={bolum=TM, isim=Veli, sinif=10, soyisim=Cem, sube=K},
               103={bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=K}
               }
         */

        // 101 numarali ogrencinin ismini yazdirin

        System.out.println(ogrenciMap.get(101)); // {bolum=MF, isim=Ali, sinif=11, soyisim=Can, sube=H}

        System.out.println(ogrenciMap.get(101).get("isim")); // Ali

        // 102 numarali ogrencinin subesini yazdirin

        System.out.println(ogrenciMap.get(102).get("sube")); // K

        // 103 numarali ogrencinin soyismini Han yapin

        ogrenciMap.get(103).put("soyisim","Han");

        // 103 numarali ogrencinin tum bilgilerini map olarak yazdiralim

        System.out.println(ogrenciMap.get(103)); // {bolum=TM, isim=Ali, sinif=11, soyisim=Han, sube=K}

    }
}
