package day12_abstractClass_interface_exception;

public interface C07_Interface {

    /*
        Interface bir class degil, kendisine ozel yapisi ve kurallari olan farkli bir YAPIDIR

        Interface full abstraction saglar, (tum method'lar abstract'tir)

        Interface'de olusturulan tum method'lar public ve abstract'dir. (yazsak da yazmasak da)

        Interface'deki tum variable'lar public static ve final'dir. (yazsak da yazmasak da)
     */

    //public void method1(){
        // Interface abstract methods cannot have body
    //}

    public void method1(); // public ve abstract'dir
    public abstract void method2(); // public ve abstract'dir
    void method(); // public ve abstract'dir

    int sayi =10; // public static final
    public static final String str = "Java Candir"; // public static final
    public char chr = 'l';// public static final


    public static void main(String[] args) {

        // sayi = 30; // Cannot assign a value to final variable 'sayi'
    }


}
