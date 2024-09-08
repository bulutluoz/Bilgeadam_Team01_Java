package day14_maps;

public class C07_NumaraliBolumListesiOlusturma extends MapDepo{

    public static void main(String[] args) {

        // bolumu MF olan ogrencilerin
        // numara, isim, soyisim, sinif ve subelerini yazdirin

        // 101 numarali ogrencinin value'sunu yazdirin
        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF

        System.out.println(ogrenciMap.get(104)); // Ayse-Can-10-H-MF


        bolumListesiYazdirma("MF");
        //MF bolumundeki ogrenci listesi
        //101 Ali Can 11 H
        //104 Ayse Can 10 H
        //106 Sevgi Can 10 K

        bolumListesiYazdirma("tm");
        //tm bolumundeki ogrenci listesi
        //102 Veli Cem 10 K
        //103 Ali Cem 11 K
        //105 Sevgi Cem 11 M

    }
}
