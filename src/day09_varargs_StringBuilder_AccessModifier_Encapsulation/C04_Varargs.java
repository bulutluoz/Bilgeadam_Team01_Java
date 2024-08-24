package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C04_Varargs {

    public static void main(String[] args) {

        // argument olarak kac adet sayi verilirse verilsin
        // ilk sayi haric geriye kalan tum sayilari toplayip
        // bulunan toplama sonucunu ilk sayi ile carpip
        // sonucu yazdiran bir method olusturun

        islemYap(1,2,3); // 1  *  (2+3) ==> 5
        islemYap(2,3,4,5,6); // 2 * (3+4+5+6) ==> 36

    }

    public static void islemYap( int ilkSayi , int... geriyeKalanSayilar   ){

        int toplam = 0;

       for ( int each : geriyeKalanSayilar){

           toplam += each;

        }

        System.out.println(ilkSayi * toplam);
    }

}
