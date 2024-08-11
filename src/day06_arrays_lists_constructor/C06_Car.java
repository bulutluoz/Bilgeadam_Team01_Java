package day06_arrays_lists_constructor;

public class C06_Car {
    // Bir Class'da gozle gorunur bir constructor yoksa
    // Java'nin yerlestirdigi DEFAULT CONSTRUCTOR vardir
    // ve obje olusturdugumuzda devreye girer

    // Default constructor parametresizdir
    // ve body'sinde kod bulunmaz

    // Siz bir class'da gorunur bir constructor olusturursaniz
    // Java default constructor'i siler

    // Biz default constructor'i goremeyiz
    // ama istersek default constructor'in ozelliklerine sahip
    // gorunur, parametresiz bir constructor olusturabiliriz

    C06_Car(){
        // Bu constructor default constructor ile ayni isleve sahiptir
        // AMMA gorunur oldugundan
        // default constructor degil
        // parametresiz constructor olarak adlandirilir
    }

    void C06_Car(){ // Method name 'C06_Car' is the same as its class name
        // bir kod blogunun return type varsa constructor olamaz
        // bu kod blogu method'dur
        // normalde method isimleri kucuk harfle baslar
        // ve class ismi ile ayndi degeri almaz
        // AMMA buyuk harfle baslatirsaniz Java buna CTE vermez
    }

    C06_Car(int sayi){
        // bir kod blogunun constructor oldugunu soylememiz icin
        // MUTLAKA 2 ozelligi tasimasi gerekir
        // 1- ismi class ismi ile ayni olmalidir
        // 2- returnType OLMAMALIDIR
    }

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String yakit = "Yakit belirtilmemis";
    int yil = 1900;
    int fiyat;
















    public String toString() {
        return "C06_Car Ozellikleri : " +
                "Marka: '" + marka + '\'' +
                ", Model: '" + model + '\'' +
                ", Yakit: '" + yakit + '\'' +
                ", Yil: " + yil +
                ", Fiyat: " + fiyat ;
    }
}
