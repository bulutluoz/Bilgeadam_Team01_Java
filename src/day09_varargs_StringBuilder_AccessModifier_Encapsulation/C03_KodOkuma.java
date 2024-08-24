package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C03_KodOkuma {

    public static void main(String[] args) {

        method1(2,"Ali","Cem","Reyhan");
        method1(1,"a","b","c");


    }

    public static void method1(int sayi, String... isimler){

        System.out.println( isimler[sayi] );
    }
}
