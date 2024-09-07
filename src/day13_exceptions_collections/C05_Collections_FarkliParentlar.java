package day13_exceptions_collections;

import java.util.*;

public class C05_Collections_FarkliParentlar {

    public static void main(String[] args) {

        // List<Integer> sayilar = new List(); // 'List' is abstract; cannot be instantiated

        List<Integer> sayilar2 = new ArrayList<>();
        // bir arrayList olusturulur AMMA data turu List secildiginden
        // olusturulan arrayList TUM LIST'lerin sahip oldugu method'lari KULLANABILIR


//        List<Integer> list1 = new List();
//        Queue<Integer> queue = new Queue();
//        Deque<Integer> deque = new Deque();

        // bu 3 Collection da Interface olduklarindan direk obje olusturulamaz
        // obje olusturmak icin child class'larin constructor'lari kullanilabilir

        List<Integer> list1             = new LinkedList<>();
        Queue<Integer> queue            = new LinkedList<>();
        Deque<Integer> deque            = new LinkedList<>();
        LinkedList<Integer> linkList    = new LinkedList<>();

        // 4 obje de LinkedList Constructor'i kullandigi halde
        // data turleri farkli secildigi icin
        // hepsinin kullanabilecegi method'lar birbirinden
        // farkliliklar gosterir

    }
}
