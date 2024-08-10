package day05_method_scope;

public class C09_Hemsire {

    /*
        static variable'lar SADECE 1 tane olusturulur ve
        herkes ayni variable'i kullanir
        yapilan degisikler tum objelere yansir


        instance variable'lar obje sayisinca kopyalanir
        her objeye kopya bir variable yapistirildigi icin
        her objenin instance variable degeri
        birbirinden FARKLI OLABILIR


        static bir variable'a class icinde
        heryerden DIREKT ulasilabilir
        EGER static bir variable'a obje uzerinden
        hemsire1.bashekimIsmi  seklinde ulasmak istersek
        Java sariya boyayip
        static bir class uyesine instance yolla ulasiyorsun
        diye bizi uyarir

     */

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Doktor Emre";

    String hemsireIsmi = "isim atanmadi";
    String hemsireAdresi = "Adres atanmadi";
    String hemsireBolum = "Bolum atanmadi";

    public static void main(String[] args) {

       C09_Hemsire hemsire1 = new C09_Hemsire();

        System.out.println(hemsire1.hemsireIsmi); // isim atanmadi
        System.out.println(hemsire1.hemsireAdresi);// Adres atanmadi
        System.out.println(hemsire1.hemsireBolum);// Bolum atanmadi

        hemsire1.hemsireIsmi = "Ayse";
        hemsire1.hemsireAdresi = "Cankaya";
        hemsire1.hemsireBolum = "Acil";

        System.out.println(hemsire1.hemsireIsmi); // Ayse
        System.out.println(hemsire1.hemsireAdresi);// Cankaya
        System.out.println(hemsire1.hemsireBolum);// Acil
        System.out.println(hemsire1.hastaneIsmi); // Yildiz Hastanesi
        System.out.println(hemsire1.hastaneAdresi);// Cankaya
        System.out.println(hemsire1.bashekimIsmi);// Doktor Emre


        C09_Hemsire hemsire2 = new C09_Hemsire();

        hemsire2.hemsireIsmi = "Canan";
        hemsire2.hemsireAdresi = "Ulus";
        hemsire2.hemsireBolum = "Goz";

        System.out.println(hemsire2.hemsireIsmi); // Canan
        System.out.println(hemsire2.hemsireAdresi);// Ulus
        System.out.println(hemsire2.hemsireBolum);// Goz
        System.out.println(hemsire2.hastaneIsmi); // Yildiz Hastanesi
        System.out.println(hemsire2.hastaneAdresi);// Cankaya
        System.out.println(hemsire2.bashekimIsmi);// Doktor Emre



        C09_Hemsire hemsire3 = new C09_Hemsire();

        hemsire3.hemsireIsmi = "Elif";
        hemsire3.hemsireAdresi = "Altindag";
        hemsire3.hemsireBolum = "Ortopedi";
        hemsire3.hastaneIsmi = "Elif Hastanesi";
        hemsire3.hastaneAdresi = "Altindag";
        hemsire3.bashekimIsmi = "Doktor Kemal";


        System.out.println(hemsire3.hemsireIsmi); // Elif
        System.out.println(hemsire3.hemsireAdresi);// Altindag
        System.out.println(hemsire3.hemsireBolum);// Ortopedi
        System.out.println(hemsire3.hastaneIsmi); // Elif Hastanesi
        System.out.println(hemsire3.hastaneAdresi);// Altindag
        System.out.println(hemsire3.bashekimIsmi);// Doktor Kemal


        System.out.println("===========");

        System.out.println(hemsire2.hemsireIsmi); // Canan
        System.out.println(hemsire2.hemsireAdresi);// Ulus
        System.out.println(hemsire2.hemsireBolum);// Goz
        System.out.println(hemsire2.hastaneIsmi); // Elif Hastanesi
        System.out.println(hemsire2.hastaneAdresi);// Altindag
        System.out.println(hemsire2.bashekimIsmi);// Doktor Kemal


        System.out.println(hemsire1.hemsireIsmi); // Ayse
        System.out.println(hemsire1.hemsireAdresi);// Cankaya
        System.out.println(hemsire1.hemsireBolum);// Acil
        System.out.println(hemsire1.hastaneIsmi); // Elif Hastanesi
        System.out.println(hemsire1.hastaneAdresi);// Altindag
        System.out.println(hemsire1.bashekimIsmi);// Doktor Kemal


        System.out.println(hemsire1.bashekimIsmi);
        // Static member 'bashekimIsmi' accessed via instance reference
        System.out.println(bashekimIsmi);

    }
}
