package day10_inheritance;

public class C11_Parent extends C10_GP{
    C11_Parent(){
        System.out.println("Parent parametresiz cons.");
    }

    C11_Parent(int b){
        System.out.println("Parent int parametreli cons.");
    }

    C11_Parent(String k){
        this(3);
        System.out.println("Parent String parametreli cons.");
    }

    C11_Parent(double c){
        super(7.2);
        c=7;
        System.out.println(c);
    }
}
