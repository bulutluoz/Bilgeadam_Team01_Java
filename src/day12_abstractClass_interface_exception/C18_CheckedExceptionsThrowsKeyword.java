package day12_abstractClass_interface_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C18_CheckedExceptionsThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {

        // Java'da fiziksel dosyalari okumak icin
        // once Java'nin o dosyayi bulmasi
        // sonra'da icindeki bilgileri okumasi gerekir
        // Java'nin kullanilacak dosyayi bulmasi icin dosya yoluna ihtiyac var

        String dosyaYolu = "src/day12_abstractClass_interface_exception/Notlar.txt";

        // Javanin dosyaya ulasabilmesi icin FileInputStream class'ini kullaniriz

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        // Unhandled exception: java.io.FileNotFoundException
        /*
            Java compileTime'da bir exception riskini farkettiginde
            Ya o dosyaya ulasamazsam diye bizden cozum bekler
            ve bize 2 alternatif sunar

            - try/catch : kullanirsak exception olussa da kontrol altina alindigi icin
                          kod calismaya devam eder

            - throws keyword : Eger exception olustugunda kodun calismaya devam etmesini ISTEMIYORSAK
                               amacimiz kirmizi cizgiyi ortadan kaldirmak ama exception olusursa kodun durmasi ise
                               method signature'ina throws keyword ekleyebiliriz
         */



    }
}
