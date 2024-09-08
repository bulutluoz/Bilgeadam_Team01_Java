package day14_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    // Bu class'i ogrenci map olusturmak ve
    // ogrenci map'i ile yapacagimiz islemleri method'lastirmak icin kullanacagiz

    public static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    } // map'e ogrencilere ekler
                 // static blok oldugu icin HERSEY'den once calisir

    public static void ismeSahipSayisiYazdirma( String arananIsim){

        // 1- value'leri kaydedelim

        Collection<String> valueColl = ogrenciMap.values();

        int sayacArananIsim = 0;

        // 2- her bir value'yu gozden gecirip,
        // ISMI parametre olarak yollanan ararnIsim olan var mi bakmamiz gerekiyor
        // for loop olusturalim

        for ( String eachValue : valueColl) { // "Ali-Can-11-H-MF"

            // 3- value String oldugu icin tum bilgilere direk ulasamiyorum
            //    bilgilere ulasabilmek icin split ile value'yu array'e cevirdik
            String[] eachValueArr  = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 4- array'de istedigimiz bilgiye ulasabiliriz

            if ( eachValueArr[0].equalsIgnoreCase(arananIsim) ){
                sayacArananIsim++;
            }

        }

        System.out.println("Map'de " + sayacArananIsim + " adet "+arananIsim +" var.");
    }

    public static void soyisimdenListeOlusturma(String arananSoyisim){

        // 1- value'leri kaydedelim
        Collection<String> valueColl = ogrenciMap.values();

        // 2- her bir value'yu gozden gecirip,
        // SOYISMI parametre olarak yollanan arananSoyisim olan var mi bakmamiz gerekiyor
        // for loop olusturalim

        System.out.println("Soyismi " + arananSoyisim + " olan ogrenciler");

        for ( String eachValue : valueColl) { // "Ali-Can-11-H-MF"

            // 3- value String oldugu icin tum bilgilere direk ulasamiyorum
            //    bilgilere ulasabilmek icin split ile value'yu array'e cevirdik
            String[] eachValueArr  = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 4- array'de istedigimiz bilgiye ulasabiliriz
            //    soyismi verilen ogrencilerin isim, sinif ve subelerini yazdirin


            if (eachValueArr[1].equalsIgnoreCase(arananSoyisim)){

                System.out.println(

                        eachValueArr[0] + " " +
                        eachValueArr[2] + " " +
                        eachValueArr[3]
                );
            }

        }


    }


    public static void sinifSubeListesiYazdirma(int arananSinif, String arananSube){

        // 1- value'leri kaydedelim
        Collection<String> valueColl = ogrenciMap.values();

        // 2- istenen bilgiye sahip ogrencileri bulmak icin
        //    valueColl'i loop ile gozden gecirelim

        System.out.println( arananSinif + "/" + arananSube + " sinifindaki ogrenci listesi");

        for (String eachValue : valueColl){

            // 3- value String oldugu icin tum bilgilere direk ulasamiyorum
            //    bilgilere ulasabilmek icin split ile value'yu array'e cevirdik
            String[] eachValueArr  = eachValue.split("-"); // [Ali, Can, 11, H, MF]


            // 4- array'de istedigimiz bilgiye ulasabiliriz
            // 11/K subesindeki ogrencilerin
            // isim soyisim ve bolumlerini yazdirin

            if (       (arananSinif+"").equals(eachValueArr[2])
                    && arananSube.equalsIgnoreCase(eachValueArr[3])       ){
                System.out.println(

                        eachValueArr[0] + " " +
                        eachValueArr[1] + " " +
                        eachValueArr[4]
                );
            }

        }


    }

}
