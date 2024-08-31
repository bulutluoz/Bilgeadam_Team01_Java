package day11_inheritanceDataTypeKullanimi_overriding;

public class C03_AvciKuslar extends C02_Kuslar{
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {


       C03_AvciKuslar avciKartal = new C03_AvciKuslar();

        System.out.println(avciKartal.omur); // H yasar ve olurler
        System.out.println(avciKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(avciKartal.cogalma); // K yumurtayla cogalir
        System.out.println(avciKartal.kanat); // K kanatlidirlar
        System.out.println(avciKartal.hareket); // A ucarlar
        System.out.println(avciKartal.beslenme); // A et yerler
        System.out.println(avciKartal.pence);// A pencelidir
        System.out.println(avciKartal.gaga); // A sivri gagali


        C02_Kuslar kusKartal = new C03_AvciKuslar();
        // Kuslar class'indaki kartal
        // data turu secilen C02_Kuslar class'indaki TUM objeler ile
        // ortak ozellikleri tasir
        // Eger constructor ile data turu farkli ise
        // ozellikleri aramaya Data Turu secilen class'dan baslariz
        System.out.println(kusKartal.omur); // H yasar ve olurler
        System.out.println(kusKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma); // K yumurtayla cogalir
        System.out.println(kusKartal.kanat); // K kanatlidirlar
        System.out.println(kusKartal.hareket); // H hareket ederler
        System.out.println(kusKartal.beslenme); // H beslenirler
        // System.out.println(kusKartal.pence);// kuslar ve hayvanlar class'inda yok CTE
        System.out.println(kusKartal.gaga); // K gagalari vardir


        C01_Hayvanlar hayvanKartal = new C03_AvciKuslar();

        System.out.println(hayvanKartal.omur); // H yasar ve olurler
        System.out.println(hayvanKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(hayvanKartal.cogalma); // K yumurtayla cogalir
        System.out.println(hayvanKartal.kanat); // K kanatlidirlar
        System.out.println(hayvanKartal.hareket); // H hareket ederler
        System.out.println(hayvanKartal.beslenme); // H beslenirler
        System.out.println(hayvanKartal.pence);// kuslar ve hayvanlar class'inda yok CTE
        System.out.println(hayvanKartal.gaga); // K gagalari vardir


    }
}
