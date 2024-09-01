package day12_abstractClass_interface_exception;

public class C14_MultipleException_FarkliTryCatch {

    public static void main(String[] args) {

        /*
            Birden fazla exception riski oldugunda
            ilk bakmamiz gereken sey
            olusabilecek exception'lar arasinda
            parent-child iliskisi olup olmadigidir

            Parent-child iliskisi yoksa
             - bagimsiz try-catch
             - bir try birden fazla catch
             - bir try ve genis kapsamli bir catch
             - ic ice try-catch kullanabiliriz
         */

        int index = 1;

        String str = "Java candir";
        int[] arr = {1,3,4,5,6,7,2,3,4,6,8,1,8};

        // str ve arr'de verilen index'deki karakter ve sayiyi yazdirin

        try {
            System.out.println("Array'in verilen index'deki elemani : "+ arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verilen index Array'in sinirlarinin disinda");
        }


        try {
            System.out.println("str'in verilen index'deki karakteri : " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Verilen index str'in sinirlarinin disinda");
        }

        System.out.println("Kod 40.satira kadar calisti");
    }
}
