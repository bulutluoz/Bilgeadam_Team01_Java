package day06_arrays_lists_constructor;

public class C09_ArabaRunner {
    public static void main(String[] args) {
        C08_Araba araba1 = new C08_Araba();
        araba1.marka = "mercedes";
        araba1.model = "A160";
        araba1.fiyat =5000;

        System.out.println(araba1);
        //C08_Araba{marka='mercedes', model='A160', yakit='Yakit belirtilmemis', yil=1900, fiyat=5000}

       C08_Araba araba2 = new C08_Araba();
        araba2.marka = "Audi";
        araba2.yil = 2012;
        araba2.fiyat = 12000;

        System.out.println(araba2);
        // C08_Araba{marka='Audi', model='Model belirtilmemis', yakit='Yakit belirtilmemis', yil=2012, fiyat=12000}

        // Her seferinde objeyi olusturup, sonra tek tek deger atayacagimiza
        // biz atamak istedigimiz degerleri constructor'a yollayalim
        // atamalari constructor yapsin
        // bize istedigimiz ozelliklere sahip araba yollasin

        C08_Araba araba3 = new C08_Araba("Opel","Corsa",4000);
        System.out.println(araba3);
        // C08_Araba{marka='Opel', model='Corsa', yakit='Yakit belirtilmemis', yil=1900, fiyat=4000}











    }






}
