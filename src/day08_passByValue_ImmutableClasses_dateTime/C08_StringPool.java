package day08_passByValue_ImmutableClasses_dateTime;

public class C08_StringPool {

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "li";
        String s3 = "a";

        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");
        String str4 = "A" + "li";
        String str5 = s1+s2;
        String str6 = s3.toUpperCase()+s2;




        // equals() metin odaklidir
        // eger metinler ayni ise bize true verir
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true
        System.out.println(str1.equals("Ali")); // true

        System.out.println("=================");
        // == operatoru ile String'leri karsilastirirsaniz
        // hem metin degerine, hem de referans degerine bakar
        // ikisi de ayni ise true dondurur

        System.out.println(str1 == str2 ); // Ali == Ali ==> true
        System.out.println(str1 == str3 ); // Ali == Ali ==> false
        System.out.println(str1 == str4 ); // Ali == Ali ==> true
        System.out.println(str1 == str5 ); // Ali == Ali ==> false
        System.out.println(str1 == str6 ); // Ali == Ali ==> false
        System.out.println(str1 == "Ali" ); // Ali == Ali ==> true

    }
}
