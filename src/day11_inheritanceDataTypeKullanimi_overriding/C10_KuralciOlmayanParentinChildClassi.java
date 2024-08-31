package day11_inheritanceDataTypeKullanimi_overriding;

public class C10_KuralciOlmayanParentinChildClassi extends C09_KuralciOlmayanParent{

    /*
        inheritance'da child class
        baslangic olarak parent class'daki tum ozelliklere sahip olur

        inheritance'da child KRAL'dir
        - isterse parent class'daki ozellikleri direk kullanir
        - isterse bazi ozellikleri kendisine uyarlayabilir
        - isterse de parent'da olmayan yeni ozellikler ekleyebilir
     */

    public void method3(){

    }
    public void method4(){

    }

    public static void main(String[] args) {

        C10_KuralciOlmayanParentinChildClassi obj = new C10_KuralciOlmayanParentinChildClassi();
        System.out.println(obj.sayi);
        obj.method1();
        obj.method2();

    }
}
