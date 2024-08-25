package day10_inheritance;

public class C05_IdariPersonel extends C03_Muhasebe{



    public static void main(String[] args) {

        C05_IdariPersonel idariPers1 = new C05_IdariPersonel();
        System.out.println(hastaneAdresi);
        idariPers1.perIsim = "Cem";
        idariPers1.sgkNo = "876543456789";
        idariPers1.perSoyisim = "Celik";

        // Java'da yazilmasa da TUM CLASS'lar Object class'ina extends eder
        // yani TUM CLASS'lar Object class'inin child class'idir
        System.out.println(idariPers1.toString());
    }
}
