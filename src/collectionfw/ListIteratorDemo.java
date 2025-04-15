package collectionfw;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("dotnet");
        list.add("c++");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
