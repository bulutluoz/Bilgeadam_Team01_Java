package day08_passByValue_ImmutableClasses_dateTime;

public class C03_PassByValue {

    // Veridimiz fiyatin %20 indirimli halini hesaplayip
    // donduren bir method olusturun

    public static void main(String[] args) {

        double fiyat = 250;

        System.out.println(indirimliFiyatDondur(fiyat));

        System.out.println(fiyat);
    }

    public static double indirimliFiyatDondur(double fiyat){

        fiyat = fiyat * 80 / 100 ;

        return fiyat;
    }
}
