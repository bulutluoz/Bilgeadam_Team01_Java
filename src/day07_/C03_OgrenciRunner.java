package day07_;

public class C03_OgrenciRunner {

    public static void main(String[] args) {

        C02_Ogrenci ogrenci1 = new C02_Ogrenci();

        System.out.println("isim : " + ogrenci1.isim + ", yas: " + ogrenci1.yas);
        // isim : ali, yas: 10


        C02_Ogrenci ogrenci2 = new C02_Ogrenci("Busra",28);

        System.out.println("isim : " + ogrenci2.isim + ", yas: " + ogrenci2.yas);
        // isim : isim belirtilmemis, yas: 23


    }
}
