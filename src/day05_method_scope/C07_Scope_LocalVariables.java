package day05_method_scope;

public class C07_Scope_LocalVariables {

    public static void main(String[] args) {
        // Local variable'lar deger atamadan olusturulabilir
        // AMMA deger atanmadan kullanilamaz

        int a;

        // System.out.println(a); // Variable 'a' might not have been initialized

        // a++ ;  Variable 'a' might not have been initialized


        // bir method'un icinde olsa da,
        // loop icinde olusturulan variable'lar loop'un disinda kullanilamaz
        // loop'un disinda olusturulan variable'lar, loop'un icinde kullanilabilir



        int sayi = 10;

        for (int i = 0; i <20 ; i++) {
            System.out.println(sayi);
            sayi = 20;
            a=23;
            String str = "Java";

            System.out.println(i);

            i++;
        }

        // System.out.println(str);
        // i++;

    }

    public static void method1(){

    }
}
