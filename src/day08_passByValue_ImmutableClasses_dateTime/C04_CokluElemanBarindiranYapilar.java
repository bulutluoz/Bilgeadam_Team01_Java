package day08_passByValue_ImmutableClasses_dateTime;

import java.util.Arrays;

public class C04_CokluElemanBarindiranYapilar {

    public static void main(String[] args) {
        // verilen array'in tum elemanlarinin degerini 2 artirip yazdiran
        // bir method olusturun

        int[] arr = {4,7,1};

        elemanlari2Artir(arr);

        System.out.println("Method call'dan sonra arr : " + Arrays.toString(arr)); // [6,9,3]

    }

    public static void elemanlari2Artir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += 2;
        }

        System.out.println(Arrays.toString(arr));

    }





















}
