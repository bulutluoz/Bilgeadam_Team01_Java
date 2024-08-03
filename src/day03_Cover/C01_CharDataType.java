package day03_Cover;

public class C01_CharDataType {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = '4';
        char chr3 = '*';

        System.out.println(chr1 + chr2); // 149
        System.out.println(chr3 < chr2); // true

        /*
            char data turu sadece 1 karakter saklamak uzere dizayn edilmistir
            ancak diger data turlerinden farkli olarak
            matematiksel islemlerde kullanildiginda
            ASCII table'daki degerleri ile isleme girer
         */

        System.out.println('1' + '2'); // 99

        System.out.println('A' < 'a'); // 65 < 97 ==> true
    }
}
