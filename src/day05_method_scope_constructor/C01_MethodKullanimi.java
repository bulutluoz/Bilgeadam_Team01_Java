package day05_method_scope_constructor;

public class C01_MethodKullanimi {

    public static void main(String[] args) {

        String str = "Java Candir";

        str.toUpperCase();  // toUpperCase() gorevini yapip bize BUYUK HARF'e cevirdigi str'i getirdi
                            // ama biz kullanmadik


        // Bir method calisip bize bir sonuc donduruyorsa
        // o sonucu method'dan almamiz gerekir

        // isterseniz sonucu method'un calistigi satirda kullanabilirsiniz

        System.out.println(   str.toUpperCase()    ); // JAVA CANDIR


        // Ya da method'un bize getirdigi sonucu daha sonra kullanmak uzere kaydedebiliriz

        String buyukHarfliStr = str.toUpperCase();



    }
}
