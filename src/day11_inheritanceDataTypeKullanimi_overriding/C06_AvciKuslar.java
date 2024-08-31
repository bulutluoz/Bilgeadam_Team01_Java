package day11_inheritanceDataTypeKullanimi_overriding;

public class C06_AvciKuslar extends C05_Kuslar{

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        /*
            Ozellikler method olarak olusturulmussa
            Objeler data turu secilen class'daki objeler ile
            ayni ozelliklere sahip olurlar
            AMMA variable'lardan farkli olarak
            method'larda constructor secilen class'a kadar
            DAHA GUNCEL BILGI var mi diye bakilir
         */

        // bir avciKus objesi olusturun
        C06_AvciKuslar avciKartal = new C06_AvciKuslar();
        avciKartal.omur(); // H yasar ve olurler
        avciKartal.solunum(); // K akcigerle nefes alirlar
        avciKartal.cogalma(); // K yumurtayla cogalirlar
        avciKartal.kanat(); // K kanatlidirlar
        avciKartal.hareket(); // A Ucarlar
        avciKartal.beslenme(); // A et yerler
        avciKartal.pence(); // A pencelidir
        avciKartal.gaga(); // A sivri gagali

        C05_Kuslar kusKartal = new C06_AvciKuslar();
        // kuslar class'indaki kartal
        kusKartal.omur(); // H yasar ve olurler
        kusKartal.solunum(); // K akcigerle nefes alirlar
        kusKartal.cogalma(); // K yumurtayla cogalirlar
        kusKartal.kanat(); // K kanatlidirlar
        kusKartal.hareket(); // A Ucarlar
        kusKartal.beslenme(); // A et yerler
        // kusKartal.pence(); // K ve H class'inda yok CTE
        kusKartal.gaga(); // A sivri gagali


        C04_Hayvanlar hayvanKartal = new C06_AvciKuslar();
        // hayvanlar class'indaki kartal
        hayvanKartal.omur(); // H yasar ve olurler
        hayvanKartal.solunum(); // K akcigerle nefes alirlar
        hayvanKartal.cogalma(); // K yumurtayla cogalirlar
        // hayvanKartal.kanat(); // H class'inda yok CTE
        hayvanKartal.hareket(); // A Ucarlar
        hayvanKartal.beslenme(); // A et yerler
        // hayvanKartal.pence(); // H class'inda yok CTE
        // hayvanKartal.gaga(); // H class'inda yok CTE


        // Kuslar clas'indan bir obje olusturun
        C05_Kuslar kus1 = new C05_Kuslar();
        kus1.omur(); // H yasar ve olurler
        kus1.solunum(); // K akcigerle nefes alirlar
        kus1.cogalma(); // K yumurtayla cogalirlar
        kus1.kanat(); // K kanatlidirlar
        kus1.hareket(); // H hareket ederler
        kus1.beslenme(); // H beslenirler
        // kus1.pence(); // K ve H class'inda yok CTE
        kus1.gaga(); // K gagalari vardir


        C04_Hayvanlar kusHayvani = new C05_Kuslar();
        kusHayvani.omur(); // H yasar ve olurler
        kusHayvani.solunum(); // K akcigerle nefes alirlar
        kusHayvani.cogalma(); // K yumurtayla cogalirlar
        //kusHayvani.kanat(); // H class'inda yok CTE
        kusHayvani.hareket(); // H hareket ederler
        kusHayvani.beslenme(); // H beslenirler
        //kusHayvani.pence(); // H class'inda yok CTE
        //kusHayvani.gaga(); // H class'inda yok CTE







    }

}
