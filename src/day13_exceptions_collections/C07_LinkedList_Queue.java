package day13_exceptions_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C07_LinkedList_Queue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // queue (kuyruk) eklenenler sona eklenir
        // silinenler bastan silinir

        queue.add(23);
        queue.add(34);
        queue.add(11);

        System.out.println(queue); // [23, 34, 11]

        queue.remove(); // bastaki elementi siler

        System.out.println(queue); // [34, 11]

        queue.add(15);
        queue.add(37);
        queue.add(19);

        System.out.println(queue); // [34, 11, 15, 37, 19]

        // add() direk queue'nun sonuna element ekler
        // offer() ise eklemeyi teklif eder,
        //         Eger sayi sinirlamasi varsa, offer() sinirin gecilip gecilmedigini kontrol ederek
        //         element ekler
        queue.offer(21);

        System.out.println(queue); // [34, 11, 15, 37, 19, 21]


        System.out.println(queue.poll()); // 34  bastaki elementi siler ve bize getirir

        System.out.println(queue); // [11, 15, 37, 19, 21]

        System.out.println(queue.remove()); // 11

        System.out.println(queue); // [15, 37, 19, 21]

        // aralarindaki fark, bos bir queue'da calistirildiklarinda ortaya cikar
        // poll() exception firlatmaz ve null dondurur
        // remove() exception firlatir

        // element() ve peek() silmeden ilk elementi getirir
        System.out.println(queue.element()); // 15 queue bos ise exception firlatir
        System.out.println(queue); // [15, 37, 19, 21]

        System.out.println(queue.peek()); // 15 queue bos ise null dondurur
        System.out.println(queue); // [15, 37, 19, 21]


    }
}
