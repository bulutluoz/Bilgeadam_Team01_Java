package day14_maps;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class C03_IsimdenOgrenciBulma {

    public static void main(String[] args) {

         // ogrenci map'inde ismi Ali olan kac ogrenci oldugunu yazdirin

        Map<Integer , String> ogrenciMap = new TreeMap<>() ;

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        // Map cok bilgi icerdigi icin, bilgilere direk ulasamayabiliriz
        // adim adim giderek, bilgiye nasil ulasabilecegimizi planlamaliyiz

        // 1- value'leri kaydedelim

         Collection<String> valueColl = ogrenciMap.values();

        /*
            [
            Ali-Can-11-H-MF,
            Veli-Cem-10-K-TM,
            Ali-Cem-11-K-TM,
            Ayse-Can-10-H-MF,
            Sevgi-Cem-11-M-TM,
            Sevgi-Can-10-K-MF,
            Esra-Han-11-M-SOZ
            ]
         */

        int sayacAli = 0;

        // 2- her bir value'yu gozden gecirip, ISMI ali olan var mi bakmamiz gerekiyor
        //    for loop olusturalim

        for ( String eachValue : valueColl){ // "Ali-Can-11-H-MF"

            // 3- value String oldugu icin tum bilgilere direk ulasamiyorum
            //    bilgilere ulasabilmek icin split ile value'yu array'e cevirdik
             String[] eachValueArr  = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 4- array'de istedigimiz bilgiye ulasabiliriz

            if ( eachValueArr[0].equalsIgnoreCase("Ali") ){
                sayacAli++;
            }

        }

        System.out.println("Map'de " + sayacAli + " adet Ali var.");

    }
}
