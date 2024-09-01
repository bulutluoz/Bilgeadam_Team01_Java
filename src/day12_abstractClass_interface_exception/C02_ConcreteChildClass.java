package day12_abstractClass_interface_exception;

public class C02_ConcreteChildClass extends C01_AbstractParentClass {


    @Override
    public void un() {
        System.out.println("Child class un");
    }

    @Override
    public void maya() {
        System.out.println("Child class maya");
    }

    @Override
    public void bicim() {
        System.out.println("Child class bicim");
    }

    @Override
    public void su() {
        System.out.println("Child class su");
    }

    public void ekMalzeme(){
        System.out.println("ek malzeme kullanirim");
    }
}
