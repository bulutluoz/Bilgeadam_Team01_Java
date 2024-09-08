package day14_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        List<Object> seylerListesi = new ArrayList<>();

        seylerListesi.add(10);
        seylerListesi.add(true);
        seylerListesi.add('e');
        seylerListesi.add(20.4);
        seylerListesi.add("Ali Can");

        int[] arr = {2,4,5};
        seylerListesi.add(arr);

        List<Integer> benimListim = new ArrayList<>(Arrays.asList(1,2,3));
        seylerListesi.add(benimListim);


        System.out.println(seylerListesi);
        // [10, true, e, 20.4, Ali Can, [I@49e4cb85, [1, 2, 3]]

        // seyler listesinin 0.index'indeki sayinin 2 katini yazdirin

        System.out.println( (Integer)seylerListesi.get(0) * 2 ); // 20

        // seyler listesinin 4.index'indeki String'i buyuk harf olarak yazdirin

        System.out.println(  ((String)seylerListesi.get(4)).toUpperCase()  ); // ALI CAN

        // seyler listesinin 5.index'indeki Array'i yazdirin

        System.out.println(Arrays.toString( (int[]) seylerListesi.get(5) )); // [2, 4, 5]


        // seyler listesinin 6.index'indeki listenin size'ini yazdirin

        System.out.println( ((List<Integer>)seylerListesi.get(6)).size()  ); // 3

        // seyler listesindeki array'in 2.elemanini 10 yapin

        ((int[])seylerListesi.get(5))[1] = 10;

        // array'i yazdiralim

        System.out.println(Arrays.toString( (int[]) seylerListesi.get(5) )); // [2, 10, 5]


    }
}
