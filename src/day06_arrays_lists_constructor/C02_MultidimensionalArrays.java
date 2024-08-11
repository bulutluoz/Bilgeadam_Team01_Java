package day06_arrays_lists_constructor;

import java.util.Arrays;

public class C02_MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] arr ={  {2,3} , {1,3,4}  ,  {4}  ,   {5,6,7,8}  };

        // eger sayi olan elementlerden birini yazdirmak istersek
        // 8'i yazdiralim

        System.out.println(arr[3][3]); // 8

        // arr'in 2.index'indeki inner array'i yazdirin

        // arr[2] ==> bize icinde 4'un oldugu array'i getirir.
        // bir array oldugu icin direkt yazdirilmaz

        System.out.println(Arrays.toString( arr[2] )); // [4]

        // TUM arr'yi yazdirin

        System.out.println(arr); // [[I@2752f6e2

        System.out.println(Arrays.toString(arr)); // [[I@e580929, [I@1cd072a9, [I@7c75222b, [I@4c203ea1]

        System.out.println(Arrays.deepToString(  arr )); // [[2, 3], [1, 3, 4], [4], [5, 6, 7, 8]]


        // arr'deki tum int elementlerin toplamini yazdirin

        int toplam = 0;

        // iki katli bir array'de tum elementleri gozden gecirmek isterseniz
        // iki katli bir loop kullanmaliyiz

        for (int i = 0; i < arr.length ; i++) { // outer arr'yi kontrol edecek

            for (int j = 0; j < arr[i].length ; j++) { // inner array'leri kontrol eder

               toplam +=  arr[i][j];

            }

        }

        System.out.println(toplam); // 43

        // arr'deki cift sayilari yan yana yazdirin

        for (int i = 0; i < arr.length ; i++) { // outer arr'yi kontrol edecek

            for (int j = 0; j < arr[i].length ; j++) { // inner array'leri kontrol eder

                if ( arr[i][j] % 2 == 0 ){
                    System.out.print( arr[i][j] + " ");
                }

            }

        }


    }
}
