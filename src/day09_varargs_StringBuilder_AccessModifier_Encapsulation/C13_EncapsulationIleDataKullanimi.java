package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C13_EncapsulationIleDataKullanimi {

    /*
            GOREV :
            1- satis bolumundeki personel rapor’un olusmasi icin
               gerekli bilgileri girebilmeli ancak sonuclari gorememeli.
               (satis tutari icin WRITE yetkisi verilecek)
            2- Rapor olusturulduktan sonra,
               izin verilen kullanicilar raporu gorebilmeli
               ancak veriler uzerinde degisiklik yapamamali.
               (toplam satis tutari icin READ yetkisi verilecek)

     */

    /*
        Bir class'daki variable'larin
        READ ve WRITE yetkilerini ayirmak
        ve istediginiz yetkiyi vermek istiyorsaniz

        1- bu variable'lara normal erisimi kapatip

        2- bizden istenen goreve uygun olarak
           encapsulation ile erisimleri acariz

           SADECE GORUNTULEMEK (Read) istediklerimiz icin Getter method'u
           SADECE ATAMA YAPMAK (Write) istediklerimiz icin Setter method'u
           olustururuz
     */

    public static void main(String[] args) {

        // C12_EncapsulePazarlama.satisTutari = 30;
        // 'satisTutari' has private access

        // C12_EncapsulePazarlama.toplamSatisTutari=450;

        C12_EncapsulePazarlama.setSatisTutari(100);
        C12_EncapsulePazarlama.setSatisTutari(200);
        C12_EncapsulePazarlama.setSatisTutari(500);
        C12_EncapsulePazarlama.setSatisTutari(100);
        C12_EncapsulePazarlama.setSatisTutari(300);

        // System.out.println(C12_EncapsulePazarlama.setSatisTutari(100));
        // Cannot resolve method 'println(void)'

        // gorev 1 OK


        // C12_EncapsulePazarlama.getToplamSatisTutari() = 45;
        // Variable expected
        // halbuki bu method bize toplam satisTutarini getiriyor

        System.out.println(C12_EncapsulePazarlama.getToplamSatisTutari());
        // gorev2 OK

    }
}
