package day03_Cover;

public class C04_ArtirmaVeAzaltma {

    public static void main(String[] args) {

        int sayi = 20;

        sayi = sayi * 5 + 3;

        // sayi variable'inin degerini 10 artirin

        // 1.yontem

        sayi = sayi + 10 ;

        // 2.yontem

        sayi  += 10;

        // 3.yontem sadece 1 artirmak icin kullanilir

        System.out.println("Artirmadan once sayi : " + sayi); // 123

        sayi++;

        System.out.println("Artirmadan sonra sayi : " + sayi); // 124

        --sayi;

        System.out.println("azaltmadan sonra sayi : " + sayi); // 123
    }
}
