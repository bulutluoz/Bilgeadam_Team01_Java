package day15_nestedMap;

import java.util.Set;

public class C04_Update extends NestedMapDepo{

    public static void main(String[] args) {

        // Tum ogrencilerin soyisimlerini buyukharf yapin

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

        // bir for loop ile tum key'leri elden gecirip
        // value'leri update edelim

        for (Integer eachKey : ogrenciKeySeti){

            String eskiSoyisim = ogrenciMap.get(eachKey).get("soyisim");
            String yeniSoyisim = eskiSoyisim.toUpperCase();

            // simdi value'yu update edelim

            ogrenciMap.get(eachKey).replace("soyisim",yeniSoyisim);

        }

        System.out.println(ogrenciMap);

        /*
                {
                    101={bolum=MF, isim=Ali, sinif=11, soyisim=CAN, sube=H},
                    102={bolum=TM, isim=Veli, sinif=10, soyisim=CEM, sube=K},
                    103={bolum=TM, isim=Ali, sinif=11, soyisim=CEM, sube=K},
                    104={bolum=MF, isim=Ayse, sinif=10, soyisim=CAN, sube=H},
                    105={bolum=TM, isim=Sevgi, sinif=11, soyisim=CEM, sube=M},
                    106={bolum=MF, isim=Sevgi, sinif=10, soyisim=CAN, sube=K},
                    107={bolum=SOZ, isim=Esra, sinif=11, soyisim=HAN, sube=M}
                    }
         */

    }
}
