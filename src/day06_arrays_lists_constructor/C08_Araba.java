package day06_arrays_lists_constructor;

public class C08_Araba {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String yakit = "Yakit belirtilmemis";
    int yil = 1900;
    int fiyat;

    C08_Araba(String mrk ,String mdl, int fyt){

        marka = mrk;
        model = mdl;
        fiyat = fyt;

    }

    C08_Araba(){
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
