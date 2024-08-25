package day10_inheritance;

public class C10_GP {

    C10_GP(){
        System.out.println("GParent parametresiz cons.");
    }

    C10_GP(double c){
        this();
        c= 5;
        System.out.println(c);
    }
}
