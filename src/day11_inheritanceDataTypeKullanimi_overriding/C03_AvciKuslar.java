package day11_inheritanceDataTypeKullanimi_overriding;

public class C03_AvciKuslar extends C02_Kuslar{
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {
     /*
         Ozellikler variable olarak olusturulmussa
         butun objeler DATA TURU secilen class'in ozelliklerini tasir
         (guncel ozelliklere bakmaz)

      */


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
        // hayvanlar class'indaki kartal
        System.out.println(hayvanKartal.omur); // H yasar ve olurler
        System.out.println(hayvanKartal.solunum); // H sonum yapar
        System.out.println(hayvanKartal.cogalma); // H cogalir
        // System.out.println(hayvanKartal.kanat); // Hayvanlar class'inda yok CTE
        System.out.println(hayvanKartal.hareket); // H hareket ederler
        System.out.println(hayvanKartal.beslenme); // H beslenirler
        // System.out.println(hayvanKartal.pence);// Hayvanlar class'inda yok CTE
        // System.out.println(hayvanKartal.gaga); // Hayvanlar class'inda yok CTE


        // Kuslar class'indan bir obje olusturalim
        C02_Kuslar kus = new C02_Kuslar();

        System.out.println(kus.omur); // H yasar ve olurler
        System.out.println(kus.solunum); // K akcigerle nefes alirlar
        System.out.println(kus.cogalma); // K yumurtayla cogalir
        System.out.println(kus.kanat); // K kanatlidirlar
        System.out.println(kus.hareket); // H hareket ederler
        System.out.println(kus.beslenme); // H beslenirler
        // System.out.println(kus.pence);// kuslar ve hayvanlar class'inda yok CTE
        System.out.println(kus.gaga); // K gagalari vardir


      C01_Hayvanlar kusHayvani = new C02_Kuslar();
      // Hayvanlar class'indaki kus'un ozellikleri
     System.out.println(kusHayvani.omur); // H yasar ve olurler
     System.out.println(kusHayvani.solunum); // H sonum yapar
     System.out.println(kusHayvani.cogalma); // H cogalir
     //System.out.println(kusHayvani.kanat); // Hayvanlar class'inda yok CTE
     System.out.println(kusHayvani.hareket); // H hareket ederler
     System.out.println(kusHayvani.beslenme); // H beslenirler
     // System.out.println(kusHayvani.pence);// Hayvanlar class'inda yok CTE
     // System.out.println(kusHayvani.gaga); // Hayvanlar class'inda yok CTE

     // hayvanlar class'indan bir obje olusturalim
     C01_Hayvanlar hayvan1 = new C01_Hayvanlar();
     System.out.println(hayvan1.omur); // H yasar ve olurler
     System.out.println(hayvan1.solunum); // H sonum yapar
     System.out.println(hayvan1.cogalma); // H cogalir
     //System.out.println(hayvan1.kanat); // Hayvanlar class'inda yok CTE
     System.out.println(hayvan1.hareket); // H hareket ederler
     System.out.println(hayvan1.beslenme); // H beslenirler
     //System.out.println(hayvan1.pence);// Hayvanlar class'inda yok CTE
     //System.out.println(hayvan1.gaga); // Hayvanlar class'inda yok CTE











    }
}
