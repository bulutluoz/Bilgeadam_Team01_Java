package day13_exceptions_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C10_Set {

    public static void main(String[] args) {

        Set<Integer>  sayilar = new HashSet<>();

        sayilar.add(12);
        sayilar.add(13);
        sayilar.add(12);
        sayilar.add(13);
        sayilar.add(12);
        sayilar.add(15);
        sayilar.add(12);

        System.out.println(sayilar); //  [12, 13, 15]




        // Hash sistemi kisiden kisiye degisebilir
        // herkesin duzeni farkli olabilir
        // ONEMLI OLAN ayni element icin HEP AYNI hash degeri olmasidir

        Set<Integer>  sayilar2 = new HashSet<>();

        System.out.println(sayilar2.hashCode()); // 0

        sayilar2.add(20);

        System.out.println(sayilar2.hashCode()); // 20

        sayilar2.add(25);

        System.out.println(sayilar2.hashCode()); // 45

        sayilar2.add(30);

        System.out.println(sayilar2.hashCode()); // 75


        List<Integer> sayilarList = new ArrayList<>();

        System.out.println(sayilarList.hashCode()); // 1

        sayilarList.add(20);

        System.out.println(sayilarList.hashCode()); // 51

        sayilarList.add(25);

        System.out.println(sayilarList.hashCode()); // 1606

        sayilarList.add(30);

        System.out.println(sayilarList.hashCode()); // 49816


    }
}
