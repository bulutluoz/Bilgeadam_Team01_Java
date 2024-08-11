package day06_arrays_lists_constructor;

public class C10_ArabaRunner {

    public static void main(String[] args) {

        C08_Araba araba1 = new C08_Araba();
        System.out.println(araba1);
        // C08_Araba{marka='Marka belirtilmemis', model='Model belirtilmemis', yakit='Yakit belirtilmemis', yil=1900, fiyat=0}

        C08_Araba araba2 = new C08_Araba("Nissan","Note",2000);

        System.out.println(araba2);
        // C08_Araba{marka='Nissan', model='Note', yakit='Yakit belirtilmemis', yil=1900, fiyat=2000}

        C08_Araba araba3 = new C08_Araba("Tofas","Sahin",
                                        "Benzin",2000,100);


        System.out.println(araba3);
        // C08_Araba{marka='Tofas', model='Sahin', yakit='Benzin', yil=2000, fiyat=100}


        C08_Araba araba4 = new C08_Araba("Volvo","S90","Benzin",15000);
        System.out.println(araba4);
        // C08_Araba{marka='Volvo', model='S90', yakit='Benzin', yil=1900, fiyat=15000}

    }

}
