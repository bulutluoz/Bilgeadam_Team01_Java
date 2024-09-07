package day13_exceptions_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C08_LinkedList_Deque {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        // Deque Double Ended Queue : cift basli kuyruk
        // yani hem bastan hem de sondan ekleme cikarma yapilabilir
        // bunu saglayabilmek icin bircok method'un ...first(), ...last() ayirimi oldugunu goruruz

        deque.add(12);
        deque.addLast(23);

        System.out.println(deque); // [12, 23]

        deque.addFirst(34);

        System.out.println(deque); // [34, 12, 23]



    }
}
