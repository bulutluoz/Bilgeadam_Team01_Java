package day07_;

public class C05_StaticKeyword {

    String str = "Java Candir";
    static int sayi  = 20;

    public static void main(String[] args) {

        System.out.println(sayi);

        // System.out.println(str);

        C05_StaticKeyword obj1 = new C05_StaticKeyword();
        System.out.println(obj1.str);

    }


    public void method(){
        System.out.println(sayi);
        System.out.println(str);
    }
}
