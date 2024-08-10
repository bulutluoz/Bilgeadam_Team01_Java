package day05_method_scope;

public class C10_BaskaClasslardanClassLevelVariableKullanimi {

    public static void main(String[] args) {

        // Hemsire objesi olusturmak ve
        // hemsire ve hastane bilgilerine ulasmak icin
        // her class'da yeniden o variable'lari olusturmamiza gerek YOK

        // Hemsire objesi olusturmak istedigimizde
        // C09 class'indan hemsire olusturabiliriz

        // Olusturdugumuz obje uzerinden
        // class'daki INSTANCE variable'lara ulasabiliriz



        C09_Hemsire hemsire4 = new C09_Hemsire();
        System.out.println(hemsire4.hemsireIsmi); // isim atanmadi


        // Eger C09 class'indaki static hastane bilgilerine ulasmak istersek
        // Obje olusturmaya gerek yok
        // ClassIsmi.staticVariableIsmi  seklinde ulasabiliriz

        System.out.println(C09_Hemsire.hastaneIsmi); // Yildiz Hastanesi
        System.out.println(C09_Hemsire.hastaneAdresi);// Cankaya


    }

}
