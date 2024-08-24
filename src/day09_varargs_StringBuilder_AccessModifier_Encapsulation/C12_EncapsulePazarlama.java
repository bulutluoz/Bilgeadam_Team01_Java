package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C12_EncapsulePazarlama {

    private static int satisTutari ;
    private static int toplamSatisTutari;



    public static int getToplamSatisTutari() {
        return toplamSatisTutari;
    }

    public static void setSatisTutari(int satisTutari) {
        C12_EncapsulePazarlama.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }
}
