package day12_abstractClass_interface_exception;

public class C06_ConcreteAlabalikClass extends C05_AbstractTatliSuBaligiClass{
    @Override
    public void yuzgec() {

    }

    @Override
    public void cogalma() {

    }

    public void solungac(){
        // bu method parent class'larda
        // concrete hale getirilmis oldugundan
        // C06'nin bu method'u implement etmesi ZORUNLU DEGILDIR
    }

    /*
        Abstract silsileden sonra gelen ILK Concrete child class
        Parent Abstract Class'lardaki CONCRETE'lesmemis olan
        TUM ABSTRACT METHOD'lari concrete hale getirmelidir
     */

}
