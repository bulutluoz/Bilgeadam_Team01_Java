package day08_passByValue_ImmutableClasses_dateTime;

import java.util.Arrays;

public class C06_PassByValue_CokluEleman {

    public static void main(String[] args) {
        /*
            Coklu eleman barindiran yapilarda
            method'da yapilan degisiklik sadece elementlere yapiliyorsa
            degisiklik kalici olur

            AMMA eger coklu eleman barindiran yapinin kendisine bir atama yapiliyorsa
            bu degisiklik kalici olmaz

         */

        int[] arr = {4,5,6,7,8};

        C04_CokluElemanBarindiranYapilar.elemanlari2Artir(arr); //  method [6, 7, 8, 9, 10] yazdirdi

        System.out.println(Arrays.toString(arr)); // [6, 7, 8, 9, 10]

        C04_CokluElemanBarindiranYapilar.elemanlari2Artir(arr); // method [8, 9, 10, 11, 12] yazdirdi

        System.out.println(Arrays.toString(arr)); // [8, 9, 10, 11, 12]


        C05_ArrayiDegistirme.arrayeElemanEkle(arr,1);
        // method'da arr'nin son hali : [8, 9, 10, 11, 12, 1]

        System.out.println(Arrays.toString(arr)); // [8, 9, 10, 11, 12]

        C05_ArrayiDegistirme.arrayeElemanEkle(arr,3);
        // method'da arr'nin son hali : [8, 9, 10, 11, 12, 3]

        System.out.println(Arrays.toString(arr)); // [8, 9, 10, 11, 12]



    }
}
