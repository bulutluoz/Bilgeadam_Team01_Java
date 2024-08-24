package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C06_StringBuilder {

    public static void main(String[] args) {

        // StringBuilder sb1 = "Java candir";
        // Java " " icinde yazilan herseyi String olarak kabul eder
        // Java'da non-primitive data turlerinde
        // farkli data turleri arasinda ATAMA olmaz (parent-child durumu haric)


        StringBuilder sb2 = new StringBuilder();
        // bos bir stringBuilder olusturur
        System.out.println(sb2.length()); // 0
        System.out.println(sb2.capacity()); // 16


        StringBuilder sb3 = new StringBuilder("Ali Can");
        // icinde Ali Can olan bir stringBuilder olusturur
        System.out.println(sb3.length()); // 7
        System.out.println(sb3.capacity()); // 16 + metninLength'i ==> 23

        // isterseniz kapasiteyi length degerine dusurebilirsiniz
        sb3.trimToSize();
        System.out.println(sb3.length()); // 7
        System.out.println(sb3.capacity()); // 7


        StringBuilder sb4 = new StringBuilder(7);
        // 7 karakter alma kapasitesinde bir StringBuilder olusturur
        System.out.println(sb4.length()); // 0
        System.out.println(sb4.capacity()); // 7


        System.out.println(sb3); // Ali Can

        // StringBuilder mutable bir class oldugundan
        // method ile yapilan degisiklikler kalici olur

        // ANCAK burada method'un bize ne dondurdugu onemlidir
        // method StringBuilder donduruyorsa method ile yapilan degisiklik KALICI olurken
        // StringBuilder dondurmeyen method'lar ile yapilan degisiklikler KALICI OLMAZ


        sb3.append(" Temizyurek");

        System.out.println(sb3); // Ali Can Temizyurek

        sb3.reverse();

        System.out.println(sb3); // keruyzimeT naC ilA

        sb3.reverse();

        System.out.println(sb3); // Ali Can Temizyurek

        System.out.println(sb3.indexOf("a"));  // 5

        System.out.println(sb3); // Ali Can Temizyurek

        System.out.println(sb3.substring(5)); // an Temizyurek

        System.out.println(sb3); // Ali Can Temizyurek

    }
}
