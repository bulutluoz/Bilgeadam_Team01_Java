package day12_abstractClass_interface_exception;

public class C10_ChildClass  implements C08_InterfaceParent1,C09_InterfaceParent2{

    /*
        Inheritance'da
        Java multiple inheritance'a izin vermez
        multilevel inheritance'a izin verir
        Eger bir child class'dan extends ile 2 class'a child olmak istersek
        Java "Class cannot extend multiple classes" diyerek CTE verir

        Interface'in en buyuk avantaji Multiple Inheritance'e izin vermesidir

        Interface'deki method'lar abstract oldugundan
        direkt calistirilmalari mumkun degildir
        child concrete class'dan methd1()'i implement ettiginizde
        hem I1'deki hem de I2'deki method1'i implement etmis oluruz

        Eger birden fazla interface'i implement ettigimizde
        ayni isimde method'lar varsa
        RETURN TYPE"LARININ AYNI OLMASI GEREKMEKTEDIR

        cakisma durumunda en iyi cozum
        birine implement etmekten vazgecmektir
        daha onceden var olan Interface'lerin degistirilmesi UYGUN DEGILDIR
        cunku interface'de yapacagimiz degisiklik
        projede pek cok class'in degismesini gerektirebilir

        Variable'lar icin boyle bir sorun olmaz
        cunku ayni isimde olan variable'larda
        interfaceismi.variableIsmi yazarak hangisini kullanacagimizi soyleyebiliriz
     */

     public void method1(){

     }

     public String method3(){

         return null;
     }

     public int method2(){
         return 0;
     }

    public static void main(String[] args) {

        System.out.println(C08_InterfaceParent1.sayi1);
    }

}
