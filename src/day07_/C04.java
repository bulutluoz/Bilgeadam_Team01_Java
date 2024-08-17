package day07_;

public class C04 {

    C04(){
        System.out.println("parametresiz C04 constructor");
    }// parametresiz C04 constructor

    C04(int sayi){
        // Bir constructor'in icinden baska cir constructor'i calistirmak istersek
        // calistiracagimiz constructor'in ismini YAZAMAYIZ
        // C04(); // bu sekilde yazdigimizda constructor degil , method calisir
        this();
        // Java'nin olusturdugu ozel bir kullanimdir
        // bu class'daki parametre uyumu olan constructor'i calistirir
        // 13.satirda yazdigimiz this() paraetresiz oldugundan
        // bu class'daki parametresiz constructor'i (5.satir) calistirir

        System.out.println("int parametreli constructor");
    } // int parametreli constructor

    C04(String s){

        // bu constructor'in icinden int parametreli constructor'i calistiralim
        this(4);
        // bir constructor icinden 2 constructor call YAPILAMAZ
        // cunku constructorCall bulundugu blokda ILK KOD olmalidir

        // this(); // Call to 'this()' must be first statement in constructor body

        System.out.println("String parametreli constructor");
    }// String parametreli constructor

    // method isimleri kucuk harfle baslar
    // ama buyuk harfle baslasa da Java CTE vermez

    public void IsimYazdir(String isim){

    }

    // method isimleri class ismi ile ayni olmaz
    // ama class ismi ile ayni isme sahip method olusturulursa Java CTE vermez

    public static void C04(){
        System.out.println("parametresiz method");
    } // parametresiz method

    public static void C04(int yas){
        System.out.println("parametreli method");
    } // parametreli method

    public static void main(String[] args) {

        C04(); // obje olusturmak disinda java isim() gorunce methodCall kabul eder
        // parametresiz method

        new C04(); // parametresiz C04 constructor

        C04(5); // parametreli method

        C04 obj = new C04(34); // int parametreli constructor
    }
}
