package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

import day09_varargs_StringBuilder_AccessModifier_Encapsulation.accessModifier.Datalar;

import javax.xml.crypto.Data;

public class C10_AccessModifierIleDatayaUlasma {

    public static void main(String[] args) {

        /*
            Access modifier bir class uyesine erisimimizi duzenler

            ANCAKKK
            access modifier bir class uyesine erisebiliyorsa
            hem atama yapabilir, hem de degerini goruntuleyebilir
            access modifier bir class uyesine erisemiyorsa
            bu durumda ne atama yapabilir, ne de degeri goruntuleyebilir

            Bir class uyesine deger atama (write) ve
            degerini goruntuleme (read) yetkilerini ayirmak isterseniz
            Access Modifier ile bu ayirma islemini yapmaniz mumkun degildir
         */

        System.out.println(C11_Pazarlama.satisTutari); // 0

        C11_Pazarlama.satisTutari = 200;

        C11_Pazarlama.toplamSatisTutari = 400;

        System.out.println(C11_Pazarlama.toplamSatisTutari); // 400
    }
}
