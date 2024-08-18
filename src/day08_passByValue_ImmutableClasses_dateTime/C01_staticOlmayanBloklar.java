package day08_passByValue_ImmutableClasses_dateTime;

public class C01_staticOlmayanBloklar {
    C01_staticOlmayanBloklar(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        C01_staticOlmayanBloklar obj = new C01_staticOlmayanBloklar();
    }

    static {
        System.out.println("1.static blok");
    }

    {
        // static olmayan bloklar
        // obje olusturulmadan once yapilmasi gereken bir ayar varsa
        // bu ayarlari yapmak icin kullanilir
        // constructor calismaya baslamadan hemen once
        // static olmayan bloklar otomatik olarak calisir
        System.out.println("1.static olmayan blok");
    }
}
