package day11_inheritanceDataTypeKullanimi_overriding;

public class C12_CevizliEkmek extends C11_KuralKoyanEkmekClassi{

    /*
        Bir abstract class'i parent edinen child class
        - abstract parent'daki
          TUM ABSTRACT (zorunlu kural koyucu) method'lari
          kendine uyarlamalidir

        - abstract parent class'indaki
          abstract olmayan method'lar (concrete method'lar)
          (tuz ve ust malzeme) child'in insiyatifine kalmistir
          normal inheritance'daki gibi
            - isterse direk kullanir
            - isterse override edip kendisine uyarlayabilir

     */

    @Override
    public void un() {
        System.out.println("Cevizli ekmekde tam bugday ekmegi kullanilir");
    }

    @Override
    public void maya() {
        System.out.println("Cevizli ekmekde %0,1 maya kullanilir");

    }

    @Override
    public void bicim() {
        System.out.println("Cevizli ekmek 500 gr'lik ekmekler kullanilir");

    }

    @Override
    public void su() {
        System.out.println("Cevizli ekmekde %2 kullanilir");

    }


}
