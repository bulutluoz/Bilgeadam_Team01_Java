package day04_Cover;

public class C06_ForLoops {

    public static void main(String[] args) {

        // 1'den 10'a kadar olan tamsayilari yazdirin

        //System.out.println(1);
        // System.out.println(2);

        // System.out.println("1, 2, 3, 4, 5, 6.....");


        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println(""); // sadece alt satira gecer

        // 10'dan 20'ye kadar(sinirlar dahil) sayilari toplayip, toplami yazdirin

        int toplam = 0;

        for (int i = 10; i <=20 ; i++) {

            toplam  = toplam + i;
        }

        System.out.println("10 ile 20 arasindaki sayilarin toplami : " + toplam);


        // 20'den baslayarak 7 ser artirarak 100'e kadar(dahil) olan sayilari yazdirin

        for (int i = 20; i <=100 ; i+=7 ) {
            System.out.print(i + " ");
        } // 20 27 34 41 48 55 62 69 76 83 90 97

        System.out.println("");


        // 3 basamakli sayilardan 43 ile bolunebilenleri yazdirin

        // sarti saglayan 3 basamakli en kucuk sayi ==> 129

        for (int i = 129; i <= 999 ; i+=43) {
            System.out.print(i + " ");
        } // 129 172 215 258 301 344 387 430 473 516 559 602 645 688 731 774 817 860 903 946 989
        System.out.println("");


        for (int i = 100; i <1000 ; i++) {

            if ( i % 43 == 0){
                System.out.print( i + " ");
            }
        } // 129 172 215 258 301 344 387 430 473 516 559 602 645 688 731 774 817 860 903 946 989

        System.out.println("");


        // 2345678 ile 4567876 arasinda 14537'un tam kati olan ilk sayiyi yazdirin

        for (int i = 2345678; i <= 4567876 ; i++) {

            if (i % 14537 == 0){
                System.out.print(i + " ");
            }

        } // bize araliktaki tum sayiyi yazdirir

        System.out.println("");

        for (int i = 2345678; i <= 4567876 ; i++) {

            if (i % 14537 == 0){
                System.out.print(i + " ");
                break; // loop'u bitirir
            }

        }
        System.out.println("");

        // 4 basamakli sayilardan 123 ile bolunebilen kac tane sayi vardir?

        int sayac = 0;

        for (int i = 1000; i <=9999 ; i++) {

            if ( i % 123 == 0){
                sayac++;
            }

        }

        System.out.println("4 basamakli sayilardan 123 ile bolunebilen " + sayac + " adet sayi vardir");


        // 4 basamakli, 123 ile bolunebilen sayilardan ilk 5 sayiyi yazdirin

        sayac = 0;

        for (int i = 1000; i <=9999 ; i++) {

            if ( i % 123 == 0){
                System.out.print(i + " ");
                sayac++;
            }

            if (sayac == 5){
                break;
            }

        }




    }
}
