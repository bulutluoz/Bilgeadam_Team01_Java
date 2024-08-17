package day07_;

import day06_arrays_lists_constructor.C08_Araba;

public class C01_ArabaRunner {

    public static void main(String[] args) {

        C08_Araba araba1 = new C08_Araba();
        araba1.marka = "Toyata";
        // C08 class'indaki instance variable'larin degerlerine sahip bir araba uretilir
        // araba'nin sizin istediginiz degerlere sahip olmasi icin
        // tek tek atama yapmaniz gerekir

        C08_Araba araba2 = new C08_Araba("Opel","Corsa",4000);
        // verdigimiz 3 argument
        // yani mrk, mdl ve fyt objeye atanmis olur
        // geriye kalan yakit ve yil class'da ilk atanan degerlere sahip olur

        C08_Araba araba3 = new C08_Araba("Nissan","Micra","Benzin",2020,10000);

    }
}
