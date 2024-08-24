package day09_varargs_StringBuilder_AccessModifier_Encapsulation;

public class C15_DataKullanimi {

    public static void main(String[] args) {

        /*
            Bir variable'i public yapmak ile

            private yapip, hem Getter, hem Setter method'u olusturmak
            arasinda islevsel olarak fark yoktur

            iki variable'a da
            hem deger atayabilir(Write)
            hem degeri goruntuleyebiliriz (Read)

            public yapmanin artisi : kisa olusu
            encapsule etmenin avantaji : set ve get ile yapilan isleme vurgu yapilmasi

            developer'lardan public kullanmak yerine
            encapsule edip getter ve setter method'u olusturmayi
            tercih edenler var
         */

        C14_EncapsuleDatalar obj = new C14_EncapsuleDatalar();

        obj.publicInt = 75;
        System.out.println(obj.publicInt); // 75


        obj.setEncapsuleInt(100);
        System.out.println(obj.getEncapsuleInt()); // 100


    }
}
