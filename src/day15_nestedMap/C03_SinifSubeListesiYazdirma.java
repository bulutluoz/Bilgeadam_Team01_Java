package day15_nestedMap;

import java.util.Set;

public class C03_SinifSubeListesiYazdirma extends NestedMapDepo{

    public static void main(String[] args) {

        // 10/K sinifindaki ogrencilerin
        // numara, isim ve soyisimlerini yazdirin

        /*
                {
                101={bolum=MF, isim=Ali, sinif=11, soyisim=Can, sube=H},
                102={bolum=TM, isim=Veli, sinif=10, soyisim=Cem, sube=K},
                103={bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=K},
                104={bolum=MF, isim=Ayse, sinif=10, soyisim=Can, sube=H},
                105={bolum=TM, isim=Sevgi, sinif=11, soyisim=Cem, sube=M},
                106={bolum=MF, isim=Sevgi, sinif=10, soyisim=Can, sube=K},
                107={bolum=SOZ, isim=Esra, sinif=11, soyisim=Han, sube=M}
                }
         */

        // tum ogrencileri gozden gecirmek icin key olarak kullanilan ogrenci numaralarini kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107]


        // bir loop ile key'leri tek tek ele alip
        // istenen bilgileri kontrol edelim
        // ve uyumlu olanlardan istenen bilgileri yazdiralim

        for ( Integer eachKey : ogrenciKeySeti ){

            if ( ogrenciMap.get(eachKey).get("sinif").equals("10")  &&
                 ogrenciMap.get(eachKey).get("sube").equalsIgnoreCase("k")) {

                System.out.println(

                        eachKey + " " +
                        ogrenciMap.get(eachKey).get("isim") + " " +
                        ogrenciMap.get(eachKey).get("soyisim")
                );
            }

        }
    }
}
