package week_14.live_class;

import java.util.ArrayList;
import java.util.*;

public class ListIteratorTest {
    public static void main(String[] args) {
        // ArrayList oluştur
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        // ListIterator oluştur
        ListIterator<String> listIterator = myList.listIterator();

        // İleri yönde dolaşma
        System.out.println("Forward Direction:");
        while (listIterator.hasNext()) {
            String language = listIterator.next();
            System.out.println(language);
        }

        // Geri yönde dolaşma
        System.out.println("\nBackward Direction:");
        while (listIterator.hasPrevious()) {
            String language = listIterator.previous();
            System.out.println(language);
        }
    }
}
