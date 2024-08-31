package day11_inheritanceDataTypeKullanimi_overriding;

public class C08_OverridingChild extends C07_OverridingParent{

    public void method1(String a,int b){
       // child class'da olusturulan method
       // signature'i ayni ise (isim ve parametrelerin data turu)
       // parent class'daki method'u override eder
       //(gecersiz kilar)

    }

    @Override
    public int method2() {
        // @Override mecburi degildir
        // Ancak kullanirsak ozel bir gorev yapar
        // parent class'daki overridden method'u kontrol altinda tutar
        // eger o method'da overriding'i bozan bir degisiklik yapilirsa
        // notasyon CTE verir
        return 8;
    }

    public void method3(){
        // @Override notasyonu kullanilmazsa
        // parent class'daki method degistirildiginde
        // child class bunu onemsemez
        // bagimsiz bir method olarak yoluna devam eder
    }

    public void method4(){
       // parent class'daki method
       // private access modifier'ina sahip oldugundan
       // child class parent class'daki method'u goremez
       // dogal olarak override edemez
    }

    public void method51(){
        // override etmek parent class'daki method'un
        // islevini degistirmek demektir
        // 'method5()' cannot override 'method5()' in 'C07_OverridingParent';
        //  overridden method is final

    }

    public static void method6(){
        // static method parent class'da olsa da
        // overriding olarak kabul etmez
    }


   protected void method7(){
        // her ne kadar signature'a dahil olmasa da
        // access modifier da overridding'de onemlidir
        // "child parent'i kisitlayamaz"
        // child class'daki overriding method'un access modifier'i
        // parent class'daki overridden method'un access modifier'indan
        // DAHA DAR OLAMAZ
   }

    public double method8(){
        // her ne kadar signature'a dahil olmasa da
        // return type da overridding'de onemlidir
        // eger overridden method'un access modifier'i
        // void veya primitive ise
        // overriding method'un access modifier'i AYNI olmalidir
        return 0;
    }


    public C06_AvciKuslar method9(){
        // eger return type non-primitive ise
        // overridden method'un  return type'i
        // overriding method'un return type'i ile
        // ya ayni data turu olmalidir,
        // veya parent class'i olmalidir

        return null;
    }







}
