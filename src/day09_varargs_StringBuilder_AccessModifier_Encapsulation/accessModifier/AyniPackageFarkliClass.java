package day09_varargs_StringBuilder_AccessModifier_Encapsulation.accessModifier;

public class AyniPackageFarkliClass {

    public static void main(String[] args) {

        Datalar datalar1 = new Datalar();

        // System.out.println(datalar1.sayiPrivate);
        // datalar1.methodPrivate();

        System.out.println(datalar1.sayiDefaultAccMod);
        datalar1.methodDefaultAccMod();

        System.out.println(datalar1.sayiProtected);
        datalar1.sayiProtected = 88;
        datalar1.methodProtected();

        datalar1.sayiPublic = 70;
        datalar1.methodPublic();


    }
}
