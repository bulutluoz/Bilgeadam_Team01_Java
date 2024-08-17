package day07_;

public class C07_Hemsire {

    /*
    1- Static variable'lar bir kere olusturulur
       ve tum objeler bu ortak variable'i kullanir

       instance variable'lar ise obje sayisinca cogaltilir
       ve her obje kendi instance variable'larini kullanir

     2- static variable'in obje uzerinden kullanilmasi
        tavsiye edilmez (intelliJ sariya boyar)
        ama obje uzerinden kullaninca itiraz etmez

     3- static variable'lara yapilan atama tum objeleri etkiler
        instance variable'lara yapilan atamalar
        sadece o objeyi etkiler


     */

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Doktor Ali";

    String hemIsmi = "Isim atanmadi";
    String hemAdresi = "Adres atanmadi";
    String hemTel = "5322346787";

    C07_Hemsire(){

    }


    public static void main(String[] args) {

        C07_Hemsire hemsire1 = new C07_Hemsire();
        System.out.println(hemsire1.hemIsmi); // atanmamis
        System.out.println(hemsire1.hemAdresi); // atanmamis
        System.out.println(hemsire1.hemTel); // 5322346787
        System.out.println(hemsire1.hastaneIsmi); // Yildiz Hastanesi
        // Static member 'hastaneIsmi' accessed via instance reference
        System.out.println(hemsire1.hastaneAdresi); // Cankaya
        System.out.println(hemsire1.bashekimIsmi); // Doktor Ali

        hemsire1.hemIsmi = "Ayse";
        hemsire1.hemAdresi = "Kizilay";
        hemsire1.hemTel = "5453454545";


        C07_Hemsire hemsire2 = new C07_Hemsire();

        System.out.println(hemsire2.hemIsmi); // atanmamis
        System.out.println(hemsire2.hemAdresi); // atanmamis
        System.out.println(hemsire2.hemTel); // 5322346787
        System.out.println(hemsire2.hastaneIsmi); // Yildiz Hastanesi
        System.out.println(hemsire2.hastaneAdresi); // Cankaya
        System.out.println(hemsire2.bashekimIsmi); // Doktor Ali

        hemsire2.hemIsmi = "Canan";
        hemsire2.hemTel = "5463465666";
        hemsire2.hemAdresi = "Altindag";
        hemsire2.hastaneIsmi = "Canan hastanesi";
        hemsire2.hastaneAdresi = "Altindag";
        hemsire2.bashekimIsmi= "Dr Sevim";

        C07_Hemsire hemsire3 = new C07_Hemsire();
        System.out.println(hemsire3.hemIsmi); // atanmamis
        System.out.println(hemsire3.hemAdresi); // atanmamis
        System.out.println(hemsire3.hemTel); // 5322346787
        System.out.println(hemsire3.hastaneIsmi); // Canan Hastanesi
        System.out.println(hemsire3.hastaneAdresi); // Altindag
        System.out.println(hemsire3.bashekimIsmi); // Doktor Sevim


        hemsire3.hemIsmi = "Fatma";
        hemsire3.hemTel = "5354567890";
        hemsire3.hemAdresi = "Yenimahalle";
        hemsire3.hastaneAdresi = "Yenimahalle";


        System.out.println("========Hemsire1=======");

        System.out.println(hemsire1.hemIsmi); // Ayse
        System.out.println(hemsire1.hemAdresi); // Kizilay
        System.out.println(hemsire1.hemTel); // 5453454545
        System.out.println(hemsire1.hastaneIsmi); // Canan Hastanesi
        System.out.println(hemsire1.hastaneAdresi); // Yenimahalle
        System.out.println(hemsire1.bashekimIsmi); // Doktor Sevim


        System.out.println("========Hemsire2=======");

        System.out.println(hemsire2.hemIsmi); // Canan
        System.out.println(hemsire2.hemAdresi); // Altindag
        System.out.println(hemsire2.hemTel); // 5463465666
        System.out.println(hemsire2.hastaneIsmi); // Canan Hastanesi
        System.out.println(hemsire2.hastaneAdresi); // Yenimahalle
        System.out.println(hemsire2.bashekimIsmi); // Doktor Sevim


        System.out.println("========Hemsire3=======");

        System.out.println(hemsire3.hemIsmi); // Fatma
        System.out.println(hemsire3.hemAdresi); // Yenimahalle
        System.out.println(hemsire3.hemTel); // 5354567890
        System.out.println(hemsire3.hastaneIsmi); // Canan Hastanesi
        System.out.println(hemsire3.hastaneAdresi); // Yenimahalle
        System.out.println(hemsire3.bashekimIsmi); // Doktor Sevim



    }
}
