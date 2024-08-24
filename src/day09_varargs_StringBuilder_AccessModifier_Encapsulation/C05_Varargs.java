package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C05_Varargs {

    public static void main(String[] args) {
        // argument olarak kac adet sayi verilirse verilsin
        // son sayi haric geriye kalan tum sayilari toplayip
        // bulunan toplama sonucunu son sayi ile carpip
        // sonucu yazdiran bir method olusturun

        islemYap(1,2,3) ; // (1+2) * 3 = 9
        islemYap(2,3,4,5); // (2+3+4) * 5 = 45
    }


    public static void islemYap( int... sayilar  ){

        /*
            Varargs kullaniminda dikkat edilecek tek bir konu var
            bir method'da parametre olarak varargs kullanilmissa
            en son parametre olmak ZORUNDADIR
         */
    }
}
