package day11_inheritanceDataTypeKullanimi_overriding;

public class C01_Hayvanlar {
    /*
        Bir obje olusturuldugunda
        - obje olusturuldugu class'daki tum objeler ile ORTAK ozelliklere sahiptir

        bundan sonrasi icin 2 ihtimal var
        1 - semada objenin ortak olarak sahip oldugu ozellik ile ilgili daha guncel bilgi olsa da
            obje olusturuldugu class'daki objeler ile ortak ozellige sahip olsun
            guncel bilgiye sahip olmasin

        2- semada objenin ortak olarak sahip oldugu ozellik ile ilgili daha guncel bilgi varsa
           guncel bilgiye sahip olsun

           Java'da ozellikleri variable olarak olusturursak 1.ihtimal
           ozellikleri method olarak olusturursak 2.ihtimal gerceklesir
     */

    public String hareket =  "hareket ederler";
    public String solunum = "nefes alirlar";
    public String beslenme =  "beslenirler";
    public String cogalma = "cogalirlar";
    public String omur =  "yasar ve olurler";


}
