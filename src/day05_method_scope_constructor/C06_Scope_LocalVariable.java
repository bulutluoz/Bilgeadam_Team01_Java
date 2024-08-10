package day05_method_scope_constructor;

public class C06_Scope_LocalVariable {

    public static void main(String[] args) {

        // Local variable'lar SADECE olusturulduklari scope'da
        // (olusturulduklari kod blogunun icinde) kullanilabilirler
        // Baslka scope'lardan (kod bloklarindan) kullanilamazlar

        int sayi = 10 ;

        System.out.println(sayi);
        sayi = 20;

        sayi *= 3 ;

        // System.out.println(str);



    }

    public static void method1(){
        // System.out.println(sayi);
        String str = "Java";


    }

    public void method2(){
        // sayi = 34;
        // str = "tava";

    }
}
