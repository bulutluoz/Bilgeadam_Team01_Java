package day14_maps;

public class C04_ArananIsimSayisiniBulma extends MapDepo{

    public static void main(String[] args) {

        // Map'de kac adet ismi Veli olan ogrenci oldugunu yazdirin

        ismeSahipSayisiYazdirma("veli");
        // Map'de 1 adet veli var.


        // Map'de kac adet ismi Sevgi olan ogrenci oldugunu yazdirin

        ismeSahipSayisiYazdirma("Sevgi");
        // Map'de 2 adet Sevgi var.

        // Map'e yeni bir ogrenci ekleyelim
        ogrenciMap.put(108,"Ali-Han-12-T-MF");

        // map'de ismi Ali olan kac ogrenci var

        ismeSahipSayisiYazdirma("Ali"); //


    }
}
