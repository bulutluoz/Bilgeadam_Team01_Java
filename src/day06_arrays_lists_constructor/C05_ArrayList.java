package day06_arrays_lists_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayList {

    public static void main(String[] args) {
        // verilen bir isimler listesinde
        // verilen bir harfi iceren isimleri silip
        // listeyi temiz hale getirin

        List<String > isimler = new ArrayList<>(Arrays.asList( "Ali", "Veli","Cem","Ayse","Canan"));

        String istenmeyenHarf = "a";

        for (int i = 0; i < isimler.size() ; i++) {

            if ( isimler.get(i).contains(istenmeyenHarf) ){

                isimler.remove(isimler.get(i));
                i--;
            }
        }
        System.out.println(isimler);

    }
}
