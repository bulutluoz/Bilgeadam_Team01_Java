package day15_nestedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NestedMapDepo {

    public static Map<Integer,Map<String,String>> ogrenciMap = new HashMap<>();

    static {
        mapeOgrenciEkle(101,"Ali","Can","11","H","MF");
        mapeOgrenciEkle(102,"Veli","Cem","10","K","TM");
        mapeOgrenciEkle(103,"Ali","Cem","11","K","TM");
        mapeOgrenciEkle(104,"Ayse","Can","10","H","MF");
        mapeOgrenciEkle(105,"Sevgi","Cem","11","M","TM");
        mapeOgrenciEkle(106,"Sevgi","Can","10","K","MF");
        mapeOgrenciEkle(107,"Esra","Han","11","M","SOZ");
    }

    public static void mapeOgrenciEkle(Integer ogrNo, String isim, String soyisim, String sinif,
                                String sube, String bolum){

        Map<String,String> ogrenciValueMap = new TreeMap<>();
        ogrenciValueMap.put("isim",isim);
        ogrenciValueMap.put("soyisim",soyisim);
        ogrenciValueMap.put("sinif",sinif);
        ogrenciValueMap.put("sube",sube);
        ogrenciValueMap.put("bolum",bolum);

        ogrenciMap.put(ogrNo,ogrenciValueMap);

    }
}
