package day06_arrays_lists_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayList {

    public static void main(String[] args) {

        // verilen bir arrayList'de tekrar eden elementler varsa
        // ilki haric tekrar edenleri silip
        // listeyi her bir elementin sadece 1 tane oldugu hale getirin

        List<String> harfler = new ArrayList<>(Arrays.asList( "a","d","s","a","d","l","d","s","a","m" ));

        List<String> tekrarsizList = new ArrayList<>(); // []


        for (int i = 0; i < harfler.size() ; i++) {

            if ( !tekrarsizList.contains(harfler.get(i))){
                tekrarsizList.add(harfler.get(i));
            }

        }

        System.out.println(tekrarsizList); // [a, d, s, l, m]

        // bizim listemizde degisiklik oldu mu ?

        System.out.println(harfler); // [a, d, s, a, d, l, d, s, a, m]

        harfler = tekrarsizList;

        System.out.println("Listemizin son hali : " + harfler); // [a, d, s, l, m]

    }
}
