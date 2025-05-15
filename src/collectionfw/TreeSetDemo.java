package collectionfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<String>();
        s.add("python");
        s.add("c");
        s.add("sql");
        s.add("nodejs");
        s.add("angularjs");

        System.out.println(s);
//        System.out.println(s.first());
//        System.out.println(s.last());

//        System.out.println(s.pollFirst());
        System.out.println("============================");
        SortedSet<String> s1 =s.headSet("n");  //wont print node but till c
        for (Object o : s1) {
            System.out.println(o);
        }
        System.out.println("============================");
        SortedSet<String> s2 =s.tailSet("n");
        for (Object o : s2) {
            System.out.println(o);
        }
        System.out.println("============================");
        SortedSet<String> s3 =s.subSet("c","p");
        for (Object o : s3) {
            System.out.println(o);
        }

    }
}
