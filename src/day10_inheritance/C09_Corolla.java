package day10_inheritance;

public class C09_Corolla extends C08_Toyota{



    public String model  = "Corolla";
    public String uretimYeri = "Sakarya";
    public String kasa = "Corolla kasasi";
    public String teker = "15 inc pirelli teker";
    public String motor = "cvvti";

    C09_Corolla(){
        super();
        System.out.println("Corolla constructor'i calisti");
    }


    public static void main(String[] args) {

        C09_Corolla corolla = new C09_Corolla();

        System.out.println(corolla.yil);


    }
}
