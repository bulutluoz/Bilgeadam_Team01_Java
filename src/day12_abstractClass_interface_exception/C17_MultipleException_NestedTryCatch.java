package day12_abstractClass_interface_exception;

public class C17_MultipleException_NestedTryCatch {

    public static void main(String[] args) {

        int index = 10;

        String str = "Java candir";
        int[] arr = {1,3,4,5,6,7,2,3,4,6,8,1,8};

        // str ve arr'de verilen index'deki karakter ve sayiyi yazdirin


        try {
            try {

                System.out.println("Array'in verilen index'deki elemani : "+ arr[index]);
                System.out.println("str'in verilen index'deki karakteri : " + str.charAt(index));

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Verilen index arr'in sinirlarinin disinda");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Verilen index str'in sinirlarinin disinda");
        }


    }
}
