package collectionfw;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionMethodsDemo1 {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add("java");
        a.add("c");
        a.add("dotnet");
        a.add("sql");
        a.add("nodejs");
//        System.out.println("a="+a);
//
//        ArrayList<String> a1 = new ArrayList<>();
//        a1.add("java");
//        a1.add("c");
//        a1.add("python");
//        a1.add("nosql");
//        System.out.println("a1="+a1);
//
//        a.retainAll(a1);
//        System.out.println("=================");
//        System.out.println("a="+a);
//
//        a.removeAll(a1);
//        System.out.println("=================");
//        System.out.println("a="+a);

        for (Object obj : a) {
            System.out.println(obj);
        }
        System.out.println("=================");
        Object[] arr = a.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

    }
}
