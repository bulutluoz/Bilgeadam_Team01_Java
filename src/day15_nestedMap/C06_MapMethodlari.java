package day15_nestedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_MapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        System.out.println(harfler); // {A=20, B=40, R=30, T=25, Z=2}

        harfler.putIfAbsent("A",40);
        System.out.println(harfler); // {A=20, B=40, R=30, T=25, Z=2}

        harfler.putIfAbsent("L",40);
        System.out.println(harfler); // {A=20, B=40, L=40, R=30, T=25, Z=2}

        System.out.println(harfler.remove("C")); // null
        System.out.println(harfler); // {A=20, B=40, L=40, R=30, T=25, Z=2}

        System.out.println(harfler.remove("B")); // 40
        System.out.println(harfler); // {A=20, L=40, R=30, T=25, Z=2}

        System.out.println(harfler.remove("A", 25)); // false
        System.out.println(harfler); // {A=20, L=40, R=30, T=25, Z=2}

        System.out.println(harfler.remove("R", 30)); // true
        System.out.println(harfler); // {A=20, L=40, T=25, Z=2}

        System.out.println(harfler.get("A")); // 20
        System.out.println(harfler.get("K")); // null

        System.out.println(harfler.getOrDefault("L",0)); // 40
        System.out.println(harfler.getOrDefault("K",0)); // 0


    }
}
