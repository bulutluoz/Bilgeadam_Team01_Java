package day12_abstractClass_interface_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_VerilenSayilariToplama {

    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // kullanici sayi girdigi muddetce, girilen sayilari alip toplayin
        // kullanici islemi bitirmek icin Q'ya bastiginda
        // toplam kac sayi girildigini
        // ve toplamlarinin ne oldugunu yazdirin
        // kullanici sayi veya Q disinda bir deger girerse
        // hata mesaji verin ve girisi isleme almayin

        Scanner scanner = new Scanner(System.in);
        double girilenSayi = 0;
        String girilenMetin = "";
        int girilenSayiAdedi = 0;
        double girilenSayilarinToplami = 0;

        while (  ! girilenMetin.equalsIgnoreCase("q") ){

            System.out.println("Lutfen toplanmak uzere bir sayi giriniz,\nBitirmek icin Q'ya basiniz...");

            try {

                girilenSayi = scanner.nextDouble();

                girilenSayilarinToplami += girilenSayi;
                girilenSayiAdedi++;

            } catch (InputMismatchException e) { // kullanici Q 'ya basarsa
                                                 // veya kabul edilemeyecek bir deger girerse
                girilenMetin = scanner.nextLine(); // sayi disinda girilen herseyi bu method alir
                                                   // biz kullanicinin girdigi sayi disindaki metne bakacagiz
                                                   // Q ise basa donunce loop bitecek, bizim birsey yapmamiz gerekmez
                                                   // Q disinda bir deger girildiyse hata mesaji verelim
                if (!girilenMetin.equalsIgnoreCase("Q")){
                    System.out.println("Ya sayi girin veya bitirmek icin Q'ya basin");
                }

            }


        }

        System.out.println("Girilen " + girilenSayiAdedi + " adet sayinin toplami : " + girilenSayilarinToplami);





    }
}
