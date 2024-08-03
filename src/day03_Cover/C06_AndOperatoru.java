package day03_Cover;

public class C06_AndOperatoru {

    public static void main(String[] args) {


        int a = 20;
        int b = 30;
        boolean c = false;
        boolean d = true;

        // sonuc odakli iseniz && tercih edilir
        // && operatoru mukemmeliyetci oldugundan
        // ilk false degeri buldugunda sonucun false oldugunu bilir
        // ve geriye kalan islemleri yapmaz
        // boylece sonuca hizli gider

        System.out.println( a>0 && b>=0 && a>b && (c=a<b) && (d=a>b) );

        System.out.println("ilk kontrolden sonra c : " + c + ", d: " + d);
        // ilk kontrolden sonra c : false, d: true

        // Eger islem onceliginiz varsa
        // & operatoru tercih edilir
        // Cunku & operatoru sonucun false olacagini bilse de
        // hic bir islemi atlamaz tum islemleri yapip
        // sonra sonucu bulur

        System.out.println( a>0 & b>=0 & a>b & (c=a<b) & (d=a>b) );

        System.out.println("ikinci kontrolden sonra c : " + c + ", d: " + d);
        // ikinci kontrolden sonra c : true, d: false
    }
}
