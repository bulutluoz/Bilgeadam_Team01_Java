package day12_abstractClass_interface_exception;

public abstract class C05_AbstractTatliSuBaligiClass extends C04_AbstractBalikClass{

    /*
        Abstract bir parent class'in
        Abstract bir child'i olabilir
        Buradaki amac parent'da belirlenen ortak ozelliklere (kurallara)
        ilave ozellikler eklemek
        veya gerekirse bazi ozellikleri guncellemektir
     */

    public void solungac(){
        System.out.println("Tatli su baliklarinin solungaclari ozeldir");
    }

    public void ortam(){
        System.out.println("Tatli suda yasarlar");
    }

    public abstract void cogalma();

}
