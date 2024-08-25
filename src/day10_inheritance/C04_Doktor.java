package day10_inheritance;

public class C04_Doktor extends C03_Muhasebe{

    /*
        Bir class'i child class yaptigimizda
        1- baslangic olarak parent class(lar)'daki TUM OZELLIKLERE sahip olur
        2- child class isterse parent class(lar)'daki bilgileri
           kendi class'ina ozel olacak sekilde guncelleyebilir
           orn: asgariUcret
        3- child class isterse parent class'larda olmayan
           yeni ozellikler (variable veya method) ekleyebilir
           orn : uzmanlikAlani
     */

    int asgariUcret = 40000;
    String uzmanlikAlani = "Uzmanlik alani atanmamis";

    public static void main(String[] args) {

        C04_Doktor doktor1 = new C04_Doktor();
        System.out.println(hastaneIsmi); // Yildiz Hastanesi
        System.out.println(hastaneAdresi); // Cankaya
        doktor1.perIsim = "Kemal";
        doktor1.perSoyisim = "Yilmaz";
        doktor1.perAdres = "Yenimahalle";
        doktor1.sgkNo = "123456765432";
        System.out.println(doktor1.asgariUcret); // 40000

    }
}
