package day14_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_MapOlusturma {

    public static void main(String[] args) {

        // Map'i olusturmadan once Key ve Value'nun neler olacagini belirlemis olmaliyiz

        Map<Integer , String> ogrenciMap = new TreeMap<>() ;

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");


    }
}
