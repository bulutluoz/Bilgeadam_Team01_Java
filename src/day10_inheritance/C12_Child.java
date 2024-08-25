package day10_inheritance;

public class C12_Child extends C11_Parent{
    C12_Child(){
        System.out.println("Child parametresiz cons.");
    }

    C12_Child(int a){
        System.out.println("Child int parametreli cons.");
    }

    C12_Child(String s){
        super(5);
        System.out.println("Child String parametreli cons");
    }

    C12_Child(String a, int b){
        super("Ali");
        System.out.println("Child 2 parametreli cons.");
    }

    C12_Child(double c){
        super(2.3);
        System.out.println(c);
    }

    public static void main(String[] args) {

        C12_Child child3 = new C12_Child("Ali");

        // C12_Child child2 = new C12_Child("a",1);

        // C12_Child child1 = new C12_Child(1.1);

        /*
            Extends keyword kullanarak
            bir class'i parent edinen
            child class'larda olusturulan HER CONSTRUCTOR'in
            ilk satirina Java super(); koyar

            EGER kodu yazan kisi
            farkli bir constructor call yazarsa
            java super();'u siler
         */
    }

}
