package day05_method_scope_constructor;

public class C08_ClassVariables {

    // Class level'da olusturulan variable'lar BUTUN CLASS'da kullanilabilir
    // AMMA variable'in direkt kullanilabilir olmasi STATIC keyword'une baglidir

    // static keyword'une sahip olan variabler'lar heryerden direkt kullanilabilir

    int sayi1=23;
    static int sayi2 = 56;

    static int a;
    static String b ;
    static boolean bl;
    static char chr;

    public static void main(String[] args) {
        // static olsun veya olmasin class level'da olusturulan variable'lara
        // DEGER ATAMA mecburiyeti yoktur
        // Class level variable'lara BIZ DEGER atamazsak,
        // Java DEFAULT OLARAK BELIRLEDIGI degerleri atama yapar

        System.out.println("a : " + a);  // 0         tum sayisal primitive'ler icin
        System.out.println("b : " + b); // null       tum non-primitive data turleri icin null
        System.out.println("bl : " + bl); // false
        System.out.println("chr : " + chr); // hiclik

        int sayi = 10 ;
        // System.out.println(sayi1); method static oldugundan, static olmayan variable direkt KULLANILAMAZ
        System.out.println(sayi2);





    }

    public static void method1(){
        // System.out.println(sayi); local variable oldugundan, olusturuldugu scope disinda kullanilamaz
        // sayi1 = 45; method static oldugundan, static olmayan variable direkt KULLANILAMAZ
        sayi2 = 78;
    }

    public void method2(){
        // sayi = 20; local variable oldugundan, olusturuldugu scope disinda kullanilamaz

        sayi1 *= 5; // sayi1 static degil(onceligi yok), method1 static degil ( variable secmez)
        sayi2 = sayi2 * 6 + 4;  // sayi1 static oldugu icin heryerden kullanilabilir

    }


}
