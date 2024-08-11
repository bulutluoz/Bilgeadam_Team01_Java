package day06_arrays_lists_constructor;

public class C07_CarUreticisi {

    public static void main(String[] args) {

          C06_Car      car1           =           new     C06_Car();
     // Class ismi  obje ismi  assignment sign  keyword  Constructor

     // Bir class'dan OBJE OLUSTURUP,
     // INITIALIZE (ilk deger atamasi) yapmak icin
     // MUTLAKA bir Constructor calismalidir.

     // Constructor yanindaki () dolayi method'a benzetilir
     // ama method degildir, kendisine ozgu bambaska bir yapidir

        System.out.println(car1.marka); // Marka belirtilmemis
        System.out.println(car1.model); // Model belirtilmemis
        System.out.println(car1.yakit); // Yakit belirtilmemis
        System.out.println(car1.yil);   // 1900
        System.out.println(car1.fiyat); // 0

        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.yakit = "Benzin";
        car1.yil = 2010;
        car1.fiyat = 7500;

        System.out.println(car1);
        // C06_Car Ozellikleri : Marka: 'Toyota', Model: 'Corolla', Yakit: 'Benzin', Yil: 2010, Fiyat: 7500

        /*
            Bir obje olusturulurken olmasi gereken syntax
            C06_Car car2 = new C06_Car();

            EGER esitligin sadece sol tarafini kullanirsak
                C06_Car car2;
                constructor calismadigi icin, obje olusturulmus olmaz
                bu haliyle car2'yi KULLANAMAYIZ

                C06_Car car3 = null;
                constructor calismadigi icin, obje olusturulmus olmaz
                bu haliyle "ben ilerde car3'u olusturmayi ve kullanmayi dusunuyorum,
                ama simdilik beklesin" anlami tasir

                car3'u kullanmak isterseniz NullPointerException verir

            EGER sadece esitligin sag tarafini kullanirsak
                new C06_Car();
                constructor calistigi icin
                Java obje olusturur,
                kodun yazildigi satirda bir araba objesi ile yapilabilecek her islemi yapabilir
                ANCAK bir variable'a atanmadigi icin
                sonraki satirlarda KULLANILAMAZ
                (Tek seferlik, kullan at objesi olur)


         */
        C06_Car car2;
        // System.out.println(car2.marka); // Variable 'car2' might not have been initialized

        C06_Car car3 = null;
        // System.out.println(car3.marka); // NullPointerException

        System.out.println(  new C06_Car().marka  ); // Marka belirtilmemis

        System.out.println(  new C06_Car().marka = "Audi"  ); // Audi
    }
}
