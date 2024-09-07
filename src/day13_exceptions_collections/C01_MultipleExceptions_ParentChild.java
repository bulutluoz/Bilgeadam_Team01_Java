package day13_exceptions_collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions_ParentChild {



    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Notlar dosyasindaki metni yazdirin

        // once Java'nin o dosyaya erismesi gerekiyor

        String dosyaYolu = "src/day12_abstractClass_interface_exception/Notlar.txt";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        // 2.adim olarak fileInputStream objesine
        // dosyadaki karakterleri okuyup bize yazdirmasini soylemeliyiz

        int k = 0 ;

        while (  ( k = fileInputStream.read()) != -1   ){
            System.out.print((char)k);
        }




    }
}
