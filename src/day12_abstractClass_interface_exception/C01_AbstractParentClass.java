package day12_abstractClass_interface_exception;

public abstract class C01_AbstractParentClass {

    public abstract void un();
    // Abstract methods cannot have a body

    public abstract void maya();
    // Abstract method in non-abstract class

    public abstract void bicim();

    public abstract void su();

    public void tuz() {
        System.out.println("Istege bagli olarak tuz kullanilabilir");
    }

    public void ustMalzeme() {
        System.out.println("Istege bagli olarak ustMalzeme kullanilabilir");
    }
}

