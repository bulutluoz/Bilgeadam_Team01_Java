package day06_arrays_lists_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayList {

    public static void main(String[] args) {

        // uzunlugu esnek olan bir listedir, array altyapisini  kullanir
        // icine konulacak elementlerin data turu olarak primitive'leri kabul etmez

        List<Integer>  sayilar = new ArrayList<>();

        // bos bir liste olusturur

        sayilar.add(3);
        sayilar.add(5);
        System.out.println(sayilar); // [3, 5]

        System.out.println(sayilar.get(1)); // 5
        System.out.println(sayilar.get(0)); // 3

        sayilar = new ArrayList<>(Arrays.asList(3,5,6,7,8,9,1,4,2,0,3));

        System.out.println(sayilar); // [3, 5, 6, 7, 8, 9, 1, 4, 2, 0, 3]

        // tum elementleri nasil gozden geciririz ?

        // tum elemntlerin toplamini yazdirin

        int toplam = 0 ;

        for (int i = 0; i < sayilar.size() ; i++) {

            toplam += sayilar.get(i);

        }

        System.out.println(toplam); // 48


        // listedeki cift sayilari yazdirin

        for (int i = 0; i < sayilar.size() ; i++) {

             if ( sayilar.get(i) % 2 == 0){
                 System.out.print(sayilar.get(i) + " ");
             }

        }


    }
}
