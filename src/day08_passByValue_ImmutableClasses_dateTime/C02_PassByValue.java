package day08_passByValue_ImmutableClasses_dateTime;

public class C02_PassByValue {

    public static void main(String[] args) {
        /*
            Java bir variable'i baska bir method'a gonderirken
            o variable'in kendisini degil, Value'sunu gonderir
            buna Pass By Value denir
         */

        double fiyat = 200;

        // %10 indirimli fiyati yazdiran bir method olusturun

        indirimYuzde10(fiyat);
        System.out.println("method call'dan sonra fiyat : " + fiyat);// 200

    }

    public static void indirimYuzde10(double fiyat){

        fiyat = fiyat * 90 / 100;

        System.out.println("Yuzde 10 indirimli fiyat : " + fiyat);

    }
}
