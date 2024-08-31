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











}
