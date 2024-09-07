package day13_exceptions_collections;

public class C03_BaziExceptionTurleri {
    public static void main(String[] args) {

        // 1- StringIndexOutOfBoundsException
        // 2- ArrayIndexOutOfBoundsException

        // verilen index String veya Array'in sinirlari disinda ise


        // 3- ArithmeticException
        //    matematiksel hatalari yakalar

        // System.out.println( 5 / 0); // ArithmeticException

        // 4- FileNotFoundException
        // 5- IOException : dosya okuma veya yazma ile ilgili tum exception'larin parent'idir


        // 6- RunTimeException : Kod calismaya basladiktan sonra ortaya cikan
        //                       tum exception'larin parent class'idir
        // 7- Exception : tum exception'larin parent class'idir

        // 8- NullPointerException

        String str;

        // System.out.println(str); deger atanmayan variable yazdirilamaz, CTE
        // Eger deger atamak istemiyorsak ama kodun da calismasini istiyorsak
        // variable null olarak ISARETLENEBILIR

        String str2 = null;
        System.out.println(str2);

        // null olarak isaretlenen bir String yazdirilabilir
        // ama yazdirma disinda bir islem yapmak isterseniz NullPointerException olusur

        // System.out.println(str2.toUpperCase()); // NullPointerException

        // 9- NumberFormatException : String olarak verilen bir sayiyi
        //                            parse yaparken, digit olmayan bir karakter varsa olusur

        String fiyat1 = "23";
        String fiyat2 = "35";
        // iki fiyatin toplamini yazdirin

        System.out.println(fiyat1 + fiyat2); // 2335

        System.out.println( Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2)); // 58


        // 10- ClassCastException : Yapilmamasi gereken bir cast islemini
        //                          yapmaya calisirsak olusur

        Integer sayi = 12;

        // String str3 = sayi ;
        // non-primitive data turlerinde variable data turu ile degerin data turu ayni OLMALIDIR
        // istisna : parent-child class'larda,
        //                  - child degeri parent variable'a direk atayabilirsiniz
        //                  - parent degeri child variable'a atamak icin cast yapabilirsiniz

        Object obj = sayi;
        Object obj2 = "Java";
        Object obj3 = true;

        Object obj4 = 45;

        Integer sayi3 = (Integer) obj4;


        Integer sayi5 = 76;
        // String str5 = sayi5;

        Object obj5 = sayi5; // sayi5 Integer class'indan, parent olan object'e atama yapabiliriz
        String str5 = (String) obj5; // Object String'in parent'i oldugundan cast yapabildik

        System.out.println(str5);


    }
}
