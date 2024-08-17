package day06_arrays_lists_constructor;

public class C08_Araba {

    public String marka = "Marka belirtilmemis";
    public String model = "Model belirtilmemis";
    public String yakit = "Yakit belirtilmemis";
    public int yil = 1900;
    public int fiyat;

    public C08_Araba(String mrk ,String mdl, int fyt){

        marka = mrk;
        model = mdl;
        fiyat = fyt;

    }

    public C08_Araba(){
        /*
            Biz marka, model ve fiyat parametrelerine sahip constructor olusturunca
            Java default constructor'i sildi

            default constructor silinince
            daha once default constructor'i kullanarak olusturulan objeler
            CTE verdi (altini kirmizi cizdi)

            CTE'yi duzeltmek icin
            default constructor'in islevlerine sahip
            parametresiz bir constructor olusturduk
         */
    }

    public C08_Araba(String marka, String model ,
              String yakit , int yil , int fiyat){

     this.marka = marka;
     this.model = model;
     this.yakit = yakit;
     this.yil = yil;
     this.fiyat = fiyat;


    }

    // Code menusunden intelliJ'e constructor olusturtabiliriz


    public C08_Araba(String marka, String model, String yakit, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "C08_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
