package day10_inheritance;

public class C14_Child extends C13_Parent{

    String str = "Java Guzeldir";
    String tel = "312 3454545";
    int a = 23;

    public static void main(String[] args) {

        C14_Child obj = new C14_Child();
        obj.method1();


    }

    public void method1(){

        String str = "Java 10 numara";
        String tel = "216 2343434";
        int b = 34;

        System.out.println(a); // 23
        System.out.println(this.a); // 23
        //System.out.println(super.a); // CTE parent class'da a yok

        System.out.println(b); // 34
        // System.out.println(this.b); // CTE class level'da ve parent'da b YOK
        // System.out.println(super.b); // CTE parent'da b YOK

        System.out.println(str); // Java 10 numara
        System.out.println(this.str); // Java Guzeldir
        System.out.println(super.str); // java candir

        System.out.println(sayi); // 5
        System.out.println(this.sayi); // 5
        System.out.println(super.sayi); // 5

        System.out.println(tel); // 216 2343434
        System.out.println(this.tel); // 312 3454545
        // System.out.println(super.tel); // CTE parent class'da tel yok




    }
}
