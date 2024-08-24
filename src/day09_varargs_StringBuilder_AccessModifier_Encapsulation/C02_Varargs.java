package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C02_Varargs {

    public static void main(String[] args) {

        // String olarak verilen isimlerden
        // uzunlugu en yuksek olan ismi bize yazdiran bir method olusturun
        // (uzunlugu esit olan isimler varsa, bunlardan herhangi biri yazdirilabilir)

        enUzunuYazdir("Ali","Veli");
        enUzunuYazdir("Ali","Veli","Hasan","Cemil");
        enUzunuYazdir("Ali","Veli","Hasan","Abdullah");
        enUzunuYazdir("Ali","Veli","Hasan","Abdullah","Ayse Sena");


    }


    public static void enUzunuYazdir(String... isimler){

        String enUzunIsim = isimler[0];

        for (int i = 0; i <isimler.length ; i++) {

            if ( isimler[i].length() > enUzunIsim.length()    ){

                enUzunIsim = isimler[i];
            }

        }

        System.out.println("Listedeki en uzun isim : " + enUzunIsim);

    }

}
