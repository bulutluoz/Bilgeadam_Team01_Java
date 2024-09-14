package day15_nestedMap;

import java.util.Map;
import java.util.TreeMap;

public class C07_MapComputeMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        System.out.println(harfler); // {A=20, B=40, R=30, T=25, Z=2}

        // A'nin value'sunu 50 yapin
        harfler.put("A",50);
        System.out.println(harfler); // {A=50, B=40, R=30, T=25, Z=2}

        // A'nin degerini 5 artirin
        int eskiDeger = harfler.get("A");
        harfler.put("A",eskiDeger+5);
        System.out.println(harfler); // {A=55, B=40, R=30, T=25, Z=2}


        // B'nin degerini 2 katina cikarin

        eskiDeger = harfler.get("B");
        harfler.replace("B",eskiDeger*2);
        System.out.println(harfler); // {A=55, B=80, R=30, T=25, Z=2}


        // T'nin degerini 5 azaltin

        harfler.compute("T", (k,v)-> v-5   );
        System.out.println(harfler); // {A=55, B=80, R=30, T=20, Z=2}


        // Z'nin degerini 20 artirin

        harfler.compute("Z", (a,b)-> b+20 );
        System.out.println(harfler); // {A=55, B=80, R=30, T=20, Z=22}

        // key olarak C varsa value'sunu 10 artirin.

        // eskiDeger = harfler.get("C");
        // harfler.replace("C",eskiDeger+10); // NullPointerException

        if (harfler.containsKey("C")){
            eskiDeger = harfler.get("C");
            harfler.replace("C",eskiDeger+10);
        }

        System.out.println(harfler); // {A=55, B=80, R=30, T=25, Z=2}

        // compute ile key olarak C varsa value'sunu 10 artirin.

        harfler.computeIfPresent("C",(k,v)-> v+10 );
        System.out.println(harfler); // {A=55, B=80, R=30, T=25, Z=2}


        // compute ile key olarak C yoksa value'su 10 olarak map'e ekleyin

        harfler.computeIfAbsent("C", v->10 );
        System.out.println(harfler); // {A=55, B=80, C=10, R=30, T=20, Z=22}


        // key olarak M yoksa value'su 50 olarak map'e ekleyin

        harfler.putIfAbsent("M",50);
        System.out.println(harfler); // {A=55, B=80, C=10, M=50, R=30, T=20, Z=22}
    }
}
