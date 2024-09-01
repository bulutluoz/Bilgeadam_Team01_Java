package day12_abstractClass_interface_exception;

public class C15_MultipleException_TekTryMultipleCatch {

    public static void main(String[] args) {


        int index = 15;

        String str = "Java candir";
        int[] arr = {1,3,4,5,6,7,2,3,4,6,8,1,8};

        // str ve arr'de verilen index'deki karakter ve sayiyi yazdirin


        try {

            System.out.println("Array'in verilen index'deki elemani : "+ arr[index]);
            System.out.println("str'in verilen index'deki karakteri : " + str.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Verilen index str'in sinirlarinin disinda");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Verilen index array'in sinirlarinin disinda");
        }

    }
}
