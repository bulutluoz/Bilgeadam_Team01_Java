package day15_nestedMap;

public class C02_NestedMapKullanimi extends NestedMapDepo{

    public static void main(String[] args) {

        System.out.println(ogrenciMap);

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

        mapeOgrenciEkle(108,"Ahmet","Bulut","12","H","MF");

        System.out.println(ogrenciMap);

        /*
                {
                101={bolum=MF, isim=Ali, sinif=11, soyisim=Can, sube=H},
                102={bolum=TM, isim=Veli, sinif=10, soyisim=Cem, sube=K},
                103={bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=K},
                104={bolum=MF, isim=Ayse, sinif=10, soyisim=Can, sube=H},
                105={bolum=TM, isim=Sevgi, sinif=11, soyisim=Cem, sube=M},
                106={bolum=MF, isim=Sevgi, sinif=10, soyisim=Can, sube=K},
                107={bolum=SOZ, isim=Esra, sinif=11, soyisim=Han, sube=M}
                108={bolum=MF, isim=Ahmet, sinif=12, soyisim=Bulut, sube=H}
                }
         */

        // 102 numarali ogrencinin ismini yazdirin

        System.out.println(ogrenciMap.get(102).get("isim"));

        // 105 numarali ogrencinin soyismini Yan yapin

        ogrenciMap.get(105).replace("soyisim","Yan");

        System.out.println(ogrenciMap);

        /*
                {
                101={bolum=MF, isim=Ali, sinif=11, soyisim=Can, sube=H},
                102={bolum=TM, isim=Veli, sinif=10, soyisim=Cem, sube=K},
                103={bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=K},
                104={bolum=MF, isim=Ayse, sinif=10, soyisim=Can, sube=H},
                105={bolum=TM, isim=Sevgi, sinif=11, soyisim=Yan, sube=M},
                106={bolum=MF, isim=Sevgi, sinif=10, soyisim=Can, sube=K},
                107={bolum=SOZ, isim=Esra, sinif=11, soyisim=Han, sube=M}
                108={bolum=MF, isim=Ahmet, sinif=12, soyisim=Bulut, sube=H}
                }
         */





    }
}
