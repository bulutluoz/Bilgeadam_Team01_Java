package day13_exceptions_collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_MultipleExceptions_ParentChild {

    public static void main(String[] args) {
        // 1.class'da yaptigimiz islemi try-catch ile handle edelim

        /*
            Bir kodda olusmasi muhtemel exception'lar arasinda
            parent child iliskisi varsa
            daha once gordugumuz 4 yontem uygulanabilir
            AMMA parent child iliskisinden dolayi
            dikkat etmemiz gereken siralama olmalidir

         */

        String dosyaYolu = "src/day12_abstractClass_interface_exception/Notlar.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

            int k = 0 ;

            while (  ( k = fileInputStream.read()) != -1   ){
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Belirtilen dosya yolu hatali");

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }
}
