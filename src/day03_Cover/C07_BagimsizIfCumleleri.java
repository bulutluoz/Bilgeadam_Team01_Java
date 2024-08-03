package day03_Cover;

public class C07_BagimsizIfCumleleri {

    public static void main(String[] args) {

        int a = 1;
        int b = 21;

        if (a > b){
            System.out.println("a b'den buyuk");
        }

        // if blogu calisir
        // ANCAK verilen a ve b degerleri istenen sartlari saglamadigi icin
        // IF BODY calismaz

        if (a % 2 == 0){
            System.out.println("a cift");
        }

        if (b % 3 != 0 ){
            System.out.println( "b 3'un kati degil");
        }

        if (a+b > 100){
            System.out.println("a ile b nin toplami 100'den buyuk");
        }

        // Bagimsiz if cumleleri isminden de anlasilacagi gibi
        // kodun geri kalanindan BAGIMSIZDIR
        // SADECE boolean sarta odaklanir
        // sart true ise if body calisir,
        // sart false ise if body calismaz
        // Birden fazla bagimsiz if cumlesi oldugunda
        // verilen degerlere bagli olarak
        // if body'lerin hepsi de calisabilir,
        // bir kismi calisip, bir kismi calismayabilir
        // veya hic bir if body'si de calismayabilir



    }
}
