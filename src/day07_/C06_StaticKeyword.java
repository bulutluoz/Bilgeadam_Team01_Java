package day07_;

public class C06_StaticKeyword {

    // C05'deki static ve instance variable'lara ulasalim

    // Baska class'lardan static variable'lara classIsmi.staticVariableIsmi seklinde ulasilir
    // Ama instance variable'lara ulasabilmek icin obje olusturulmalidir


    public static void main(String[] args) {

        System.out.println(C05_StaticKeyword.sayi);

        C05_StaticKeyword objC05 = new C05_StaticKeyword();
        System.out.println(objC05.str);

        // obje kullanilarak static variable da kullanilabilir mi ?

        objC05.sayi=20; // Static member 'sayi' accessed via instance reference

    }


    public void method1(){
        System.out.println(C05_StaticKeyword.sayi);

        C05_StaticKeyword objC05 = new C05_StaticKeyword();
        System.out.println(objC05.str);
    }
}
