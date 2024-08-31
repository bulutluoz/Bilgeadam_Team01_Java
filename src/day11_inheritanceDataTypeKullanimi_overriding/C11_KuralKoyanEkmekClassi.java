package day11_inheritanceDataTypeKullanimi_overriding;

public abstract class C11_KuralKoyanEkmekClassi {

    /*
        Bu class'in amaci
        Ekmek yapmak isteyen class'larin bulundurmasi gereken
        method'lari belirlemektir

        Bu method'larin bazisi Mecburi olacak(un, maya, bicim, su) ,
        bazilari ise istege bagli (tuz, ustMalzeme)olacaktir.

        Kural koymak icin
        1- kural koyacak class abstract olmalidir
           (abstract class veya interface)
           bir class'i abstract class yapmak icin
           class deklarasyonuna abstract yazilmalidir
        2- child clas'larin
           MUTLAKA kendilerine uyarlamasini istediginiz
           methodlar da abstract method olmali
           bir method'u abstract yapmak icin
           - method deklarasyonuna abstract yazin
           - abstract method'larin body'si olmaz
             (kural koyan bir cumle gibi dusunebiliriz)

     */

    public abstract void un();
    // Abstract methods cannot have a body

    public abstract void maya();

    public abstract void bicim();

    public abstract void su();

    public void tuz(){
        System.out.println("Istege bagli olarak tuz kullanilabilir");
    }

    public void ustMalzeme(){
        System.out.println("Istege bagli olarak ustMalzeme kullanilabilir");
    }
}
