package day10_inheritance;

public class C06_Hemsire_ConstructorCall extends C03_Muhasebe{

    public static void main(String[] args) {

        /*
            Bir objenin olusturulabilmesi ve ilk deger atamasi yapilabilmesi icin
            MUTLAKA bir CONSTRUCTOR calismalidir

            CONSTRUCTOR calistiginda, class'da var olan
            instance variable'lar ve degerlerinin birer kopyasini alip
            OBJE'ye yapistirir

            Bir child class'dan obje olusturuldugunda
            PARENT class(lar)'daki variable'lara ulasabilmesi icin
            PARENT class(lar)'daki constructor'larin da calismasi gerekir

            Java bu calismayi saglayabilmek icin
            super(); kullanir

            Yani child class'daki constructor calismadan
            "once parent constructor calissin" der

         */

        C06_Hemsire_ConstructorCall hemsire1 = new C06_Hemsire_ConstructorCall();

        hemsire1.perIsim ="Ayse";
        hemsire1.sgkNo = "234565432345";

    }
}
