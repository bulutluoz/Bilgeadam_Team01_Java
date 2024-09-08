package day14_maps;

import java.util.*;

public class C01_Set_TekrarEdenElemenalariSilme {

    public static void main(String[] args) {

        // Verilen bir array’deki tekrar eden elementleri silerek,
        // her element’den sadece bir tane olacak sekilde yeni bir array olusturun.

        int[] arr = {3,5,6,4,2,3,5,7,5,6,3,5,7,5,3,6};
        // list ile bu soruyu cozebiliriz

        List<Integer> tekrarsizList = new ArrayList<>();

        for (Integer each : arr){

            if ( !tekrarsizList.contains(each) ){
                tekrarsizList.add(each);
            }

        }

        System.out.println( "Tekrarsiz liste : " + tekrarsizList);



        // Set ile soruyu tekrar cozelim
        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (Integer each: arr){
            tekrarsizSet.add(each);
        }

        System.out.println("Tekrarsiz Set : " + tekrarsizSet);
        //Tekrarsiz Set : [2, 3, 4, 5, 6, 7]


        // Array'deki tekrar eden sayilarin tek hale donusturuldugu
        // bir Set var ama bizden array isteniyor

        int[] yeniArr = new int[tekrarsizList.size()]; // [0, 0, 0, 0, 0, 0]

        // set index desteklemez,
        // array'e element eklemek icin index zorunlu
        // kendi index'imizi olusturabiliriz

        int index= 0;

        for (Integer each : tekrarsizSet){

            yeniArr[index] = each;
            index++;
        }



        System.out.println( "Tekrarsiz yeni array : " + Arrays.toString(yeniArr));



    }
}
