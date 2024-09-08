package day14_maps;

public class C11_TumSiniflariUpdateEtme extends MapDepo{

    public static void main(String[] args) {

        // Yilsonu icin tum siniflari artirin
        // 9,10,11.siniflari 1 artirin,
        // 12.siniflar icin sinif bilgisine Mezun yazin
        // sinif bilgisi olarak Mezun yazan varsa dokunmayin

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

        yilSonuSiniflariArtir();
        System.out.println(ogrenciMap);
        /*
                {
                101=Ali-Can-12-H-MF,
                102=Veli-Cem-11-K-TM,
                103=Ali-Cem-12-K-TM,
                104=Ayse-Can-11-H-MF,
                105=Sevgi-Cem-12-M-TM,
                106=Sevgi-Can-11-K-MF,
                107=Esra-Han-12-M-SOZ
                }
         */

        yilSonuSiniflariArtir();
        System.out.println(ogrenciMap);
        /*
                {
                101=Ali-Can-Mezun-H-MF,
                102=Veli-Cem-12-K-TM,
                103=Ali-Cem-Mezun-K-TM,
                104=Ayse-Can-12-H-MF,
                105=Sevgi-Cem-Mezun-M-TM,
                106=Sevgi-Can-12-K-MF,
                107=Esra-Han-Mezun-M-SOZ
                }
         */
    }
}
