package day14_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public static void bolumListesiYazdirma(String arananBolum){

        // EGER key ve value birlikte kullanilacaksa
        // oncelikle key'leri kaydetmeliyiz

        // 1.adim : key'leri bir Set olarak kaydedelim
         Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
         // [101, 102, 103, 104, 105, 106, 107]


        // 2.adim bir Set olarak kaydettigimiz key'leri tek tek ele alalim
        //        o key'i ve key'e ait value'yu birlikte degerlendirelim

        System.out.println(arananBolum + " bolumundeki ogrenci listesi");

        for ( Integer eachKey : ogrenciKeySeti
             ) {
            // 3. adim eachKey'e ait  eachValue'yu kaydedelim
            String eachValue  = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4.adim bilgilere ulasabilmek icin value'u split ile array yapalim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5. array'den istedigimiz kontrolleri yapip, istedigimiz bilgileri alabiliriz
            // bolumu MF olan ogrencilerin
            // numara, isim, soyisim, sinif ve subelerini yazdirin

            if (eachValueArr[4].equalsIgnoreCase(arananBolum)){

                System.out.println(
                       eachKey + " " +
                       eachValueArr[0]+ " " +
                       eachValueArr[1]+ " " +
                       eachValueArr[2]+ " " +
                       eachValueArr[3]

                );
            }


        }
    }

    public static void numaraliSinifListesiYazdir(int arananSinif){

        // 1.adim : key'leri bir Set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim bir Set olarak kaydettigimiz key'leri tek tek ele alalim
        //        o key'i ve key'e ait value'yu birlikte degerlendirelim

        System.out.println(arananSinif + ". sinif ogrenci listesi");

        for ( Integer eachKey : ogrenciKeySeti
        ) {
            // 3. adim eachKey'e ait  eachValue'yu kaydedelim
            String eachValue  = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4.adim bilgilere ulasabilmek icin value'u split ile array yapalim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5. array'den istedigimiz kontrolleri yapip, istedigimiz bilgileri alabiliriz
            // 11.sinif ogrencilerinin
            // numara, isim, soyisim ve subelerini yazdirin

            if ( (arananSinif+"").equals(eachValueArr[2]) ){

                System.out.println(

                        eachKey + " " +
                        eachValueArr[0] + " " +
                        eachValueArr[1] + " " +
                        eachValueArr[3]
                );
            }


        }

    }

    public static void numaraIleOgrenciSoyisminiGuncelleme(int ogrenciNo , String yeniSoyisim){

        // 1. adim verilen ogrenci numarasindan value'ye ulasip kaydedelim
        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

        // 2. adim bilgilere ulasabilmek icin, split edip kaydedelim
         String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

         // 3. adim istenen update'i array'de yapalim
        ogrenciValueArr[1] = yeniSoyisim;

        // 4.adim : array'de update'i yaptik
        //          ANCAKKK map'i guncellemek icin array'in yeni halini
        //          birlestirerek yeniValue'yu elde etmeliyiz

        String yeniValue = String.join("-",ogrenciValueArr);

        // 5.adim : ogrenci no ve yeni value'yu kullanarak map'i guncelleyelim

        ogrenciMap.put(ogrenciNo,yeniValue);

    }

    public static void tumSoyisimleriBuyukHarfYap(){

        // update oldugu icin key ve value'ye birlikte ihtiyac var

        // 1.adim : key'leri bir Set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim bir Set olarak kaydettigimiz key'leri tek tek ele alalim
        //        o key'i ve key'e ait value'yu birlikte degerlendirelim

        for ( Integer eachKey : ogrenciKeySeti
        ) {
            // 3. adim eachKey'e ait  eachValue'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4.adim bilgilere ulasabilmek icin value'u split ile array yapalim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim array'de soyismi buyuk harfe cevrilelim
            eachValueArr[1] = eachValueArr[1].toUpperCase();

            //6- soyismi array'de update ettik
            //   map'i update edebilmek icin array'i yeniValue haline getirelim

            String yeniValue = String.join("-",eachValueArr);

            // 7- eachKey ve yeni value ile map'i guncelleyelim
            ogrenciMap.put(eachKey,yeniValue);

        }

    }

    public static void yilSonuSiniflariArtir(){

        // update oldugu icin key ve value'ye birlikte ihtiyac var

        // 1.adim : key'leri bir Set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim bir Set olarak kaydettigimiz key'leri tek tek ele alalim
        //        o key'i ve key'e ait value'yu birlikte degerlendirelim

        for ( Integer eachKey : ogrenciKeySeti
        ) {
            // 3. adim eachKey'e ait  eachValue'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4.adim bilgilere ulasabilmek icin value'u split ile array yapalim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim array'de sinif bilgisini update edelim

            switch (eachValueArr[2]){

                case "9" :
                    eachValueArr[2]="10";
                    break;

                case "10" :
                    eachValueArr[2]="11";
                    break;

                case "11" :
                    eachValueArr[2]="12";
                    break;

                case "12" :
                    eachValueArr[2]="Mezun";
                    break;
            }

            //6- array'de update ettik
            //   map'i update edebilmek icin array'i yeniValue haline getirelim

            String yeniValue = String.join("-",eachValueArr);

            // 7- eachKey ve yeni value ile map'i guncelleyelim
            ogrenciMap.put(eachKey,yeniValue);
        }
    }

}
