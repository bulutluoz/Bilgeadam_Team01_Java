package day08_passByValue_ImmutableClasses_dateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_MutableImmutableClasses {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.substring(5)); // Candir

        System.out.println(str); // Java Candir

        str = str.toUpperCase();


        System.out.println(str); // JAVA CANDIR

        // String'de method ile yapilan degisiklikler kalici olmaz
        // degisikligin kalici olmasi icin ATAMA yapilmalidir


        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Can"));

        System.out.println(isimler); // [Ali, Veli, Can]

        isimler.add("Ayse");

        System.out.println(isimler); // [Ali, Veli, Can, Ayse]

        isimler.add(1,"Canan");

        System.out.println(isimler); // [Ali, Canan, Veli, Can, Ayse]

        isimler.set(2,"Cemil");

        System.out.println(isimler); // [Ali, Canan, Cemil, Can, Ayse]

    }
}
