package day07_;

public class C08_StaticBlocks {

    C08_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    static {
        System.out.println("static blok2 calisti");
    }

    static {
        System.out.println("static blok1 calisti");
        /*
            static bloklar tum class uyelerinden
            HATTA main method'dan bile ONCE CALISIR

            genelde class calismaya baslamadan yapilmasi gereken bir ayar varsa
            o ayarlari yapmak icin kullanilir
         */
    }



    public static void main(String[] args) {
        System.out.println("main method calisti");
    }

    public static void method1(){
        System.out.println("method1 calisti");
    }
}
