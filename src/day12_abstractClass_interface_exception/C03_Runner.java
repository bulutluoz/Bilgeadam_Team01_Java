package day12_abstractClass_interface_exception;

public class C03_Runner {

    public static void main(String[] args) {

        // Abstract class'lar class oldugu icin constructor'lari vardir
        // AMMA abstract c;lass'lardan obje OLUSTURULAMAZ

        // C01_AbstractParentClass objParent = new C01_AbstractParentClass();
        //'C01_AbstractParentClass' is abstract; cannot be instantiated
        // objParent.su();


        C01_AbstractParentClass objParent = new C02_ConcreteChildClass();
        // Parent class'daki ozelliklere sahip bir obje olusturmak istedik
        // Parent class abstract oldugundan obje olusturulamaz,
        // bu sebeple constructor olarak child class'in constructor'ini kullandik

        objParent.su();
        objParent.ustMalzeme();
        // objParent.ekMalzeme(); parentClass'da yok CTE verir

    }
}
