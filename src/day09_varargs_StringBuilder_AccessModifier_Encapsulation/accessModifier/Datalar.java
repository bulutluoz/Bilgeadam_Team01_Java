package day09_varargs_StringBuilder_AccessModifier_Encapsulation.accessModifier;

public class Datalar {

    private int sayiPrivate = 20;
    int sayiDefaultAccMod = 30;
    protected int sayiProtected = 40;
    public int sayiPublic = 50;

    private void methodPrivate(){
        System.out.println("private method calisti");
    }
    void methodDefaultAccMod(){
        System.out.println("Default acc mod.'a sahip  method calisti");
    }
    protected void methodProtected(){
        System.out.println("protected method calisti");
    }
    public void methodPublic(){

        System.out.println("public method calisti");

    }



    public static void main(String[] args) {

        Datalar datalar1 = new Datalar();

        System.out.println(datalar1.sayiPrivate);
        datalar1.methodPrivate();

        System.out.println(datalar1.sayiDefaultAccMod);
        datalar1.methodDefaultAccMod();

        System.out.println(datalar1.sayiProtected);
        datalar1.sayiProtected = 88;
        datalar1.methodProtected();

        datalar1.sayiPublic = 70;
        datalar1.methodPublic();



    }
}
