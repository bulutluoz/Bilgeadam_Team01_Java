package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

import day09_varargs_StringBuilder_AccessModifier_Encapsulation.accessModifier.Datalar;

public class C08_FarkliPackageChildClass extends Datalar {

    public static void main(String[] args) {

        C08_FarkliPackageChildClass datalar1 = new C08_FarkliPackageChildClass();

        //System.out.println(datalar1.sayiPrivate);
        //datalar1.methodPrivate();

        //System.out.println(datalar1.sayiDefaultAccMod);
        //datalar1.methodDefaultAccMod();

        System.out.println(datalar1.sayiProtected);
        datalar1.sayiProtected = 88;
        datalar1.methodProtected();

        datalar1.sayiPublic = 70;
        datalar1.methodPublic();
    }



}
