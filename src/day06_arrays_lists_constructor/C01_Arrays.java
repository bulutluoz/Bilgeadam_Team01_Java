package day06_arrays_lists_constructor;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int[] arr = new int[5]; // [0, 0, 0, 0, 0]

        System.out.println( arr[2]   ); // 0

        arr[0] = 5 ; // [5, 0, 0, 0, 0]

        arr[3] = 6; // [5, 0, 0, 6, 0]

        // arr[5] = 8; // [5, 0, 0, 6, 0] ArrayIndexOutOfBoundsException

        System.out.println(arr); // [I@2752f6e2

        System.out.println(Arrays.toString(arr)); // [5, 0, 0, 6, 0]


        // Bir array'in tum elementlerine nasil ulasilir ?

        // arr'nin tum elementlerinin toplamini yazdirin
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        System.out.println(toplam); // 11

        // arr'in tum elementlerine 3 ekleyin

        for (int i = 0; i < arr.length ; i++) {

            // arr[i] = arr[i] + 3 ;

            arr[i] += 3 ;
        }

        System.out.println(Arrays.toString(arr)); // [8, 3, 3, 9, 3]

        // array'in tum elementlerini bulunduklari index degeri kadar azaltin

        for (int i = 0; i < arr.length ; i++) {

            // arr[i] = arr[i] - i ;

            arr[i] -= i ;
        }

        System.out.println(Arrays.toString(arr)); // [8, 2, 1, 6, -1]


    }
}
