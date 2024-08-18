package day08_passByValue_ImmutableClasses_dateTime;

import java.util.Arrays;

public class C05_ArrayiDegistirme {

    // verilen bir array'in uzunlugundan 1 fazla uzunlukta yeni bir array olusturup
    // verdigimiz sayiyi son eleman olarak ekleyen
    // ve yeni halini yazdiran bir method olusturun


    public static void main(String[] args) {

        int[] arr = {3,8,1};
        int eklenecekSayi = 5;

        arrayeElemanEkle(arr,eklenecekSayi); // method'da [3, 8, 1, 5] yazdirdi

        System.out.println("Method call'dan sonra arr : " + Arrays.toString(arr)); // [3, 8, 1]

    }


    public static void arrayeElemanEkle( int[] arr , int eklenecekSayi){
        // arr = {3,8,1}

        int[] yeniArr = new int[arr.length +1]; // [0, 0, 0, 0]

        // eski array'deki elemanlari yeni array'e kopyalayalim

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        }

        // yeniArr => [3, 8, 1, 0]

        //eklenecek sayiyi son index'e atayalim

        yeniArr[yeniArr.length-1] = eklenecekSayi; // yeniArr => [3, 8, 1, 5]

        arr = yeniArr; // arr'nin kendisine atama var

        System.out.println("arr'nin son hali : "+ Arrays.toString(arr));
    }

}
