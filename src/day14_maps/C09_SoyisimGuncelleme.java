package day14_maps;

public class C09_SoyisimGuncelleme extends MapDepo{

    public static void main(String[] args) {

        // 103 numarali ogrencinin soyismini Yildiz olarak guncelleyin

        String ogrenci103Value = ogrenciMap.get(103);

        System.out.println(ogrenci103Value); // Ali-Cem-11-K-TM

        String[] ogrenci103valueArr = ogrenci103Value.split("-"); // [Ali, Cem, 11, K, TM]

        ogrenci103valueArr[1] = "Yildiz"; // [Ali, Yildiz, 11, K, TM]

        // ogrenci map'ini guncelleyebilmek icin
        // array'i String value bicimine donusturmemiz gerekiyor

        String yeniValue = String.join("-",ogrenci103valueArr); // Ali-Yildiz-11-K-TM

        // artik map'i guncelleyebiliriz
        ogrenciMap.put(103,yeniValue);

        System.out.println(ogrenciMap);

        /*
                {
                    101=Ali-Can-11-H-MF,
                    102=Veli-Cem-10-K-TM,
                    103=Ali-Yildiz-11-K-TM,
                    104=Ayse-Can-10-H-MF,
                    105=Sevgi-Cem-11-M-TM,
                    106=Sevgi-Can-10-K-MF,
                    107=Esra-Han-11-M-SOZ
                    }
         */

        numaraIleOgrenciSoyisminiGuncelleme(102,"Celik");
        numaraIleOgrenciSoyisminiGuncelleme(105,"Cicek");

        System.out.println(ogrenciMap);

        /*
                {
                    101=Ali-Can-11-H-MF,
                    102=Veli-Celik-10-K-TM,
                    103=Ali-Yildiz-11-K-TM,
                    104=Ayse-Can-10-H-MF,
                    105=Sevgi-Cicek-11-M-TM,
                    106=Sevgi-Can-10-K-MF,
                    107=Esra-Han-11-M-SOZ
                    }
         */

    }
}
