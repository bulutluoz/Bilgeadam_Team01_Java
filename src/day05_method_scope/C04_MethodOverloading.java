package day05_method_scope;

public class C04_MethodOverloading {

    public static void main(String[] args) {

       // Bir class'da ayni isimde birden fazla method olusturmaya OVERLOADING denir
       // Overloading'in amaci ayni method'un farkli data turleri ile calisabilmesi
       // veya farkli amaclar icin tek bir method'un kullanilmasi OLABILIR

        toplamiYazdir(3,5,6); // Verilen 3 tamsayinin toplami : 14

        toplamiYazdir("Java"," ","Candir"); // Verilen 3 String'in toplami : Java Candir

        toplamiYazdir(6,7); // Verilen 2 tamsayinin toplami : 13

        toplamiYazdir(6.5,4); // Verilen double ve tamsayinin toplami : 10.5

        toplamiYazdir(5, 4.5);


    }

    public static void toplamiYazdir( int sayi1 , double sayi2  ){

        System.out.println("Verilen double ve tamsayinin toplami : " + (sayi1+sayi2));
    }

    public static void toplamiYazdir( double sayi1 , int sayi2  ){

        System.out.println("Verilen double ve tamsayinin toplami : " + (sayi1+sayi2));
    }

    public static void toplamiYazdir( int sayi1 , int sayi2  ){

        System.out.println("Verilen 2 tamsayinin toplami : " + (sayi1+sayi2));
    }

    public static void toplamiYazdir( int sayi1 , int sayi2, int sayi3  ){

        System.out.println("Verilen 3 tamsayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    public static void toplamiYazdir( String str1 , String str2, String str3  ){

        System.out.println("Verilen 3 String'in toplami : " + (str1+str2+str3));
    }

}
