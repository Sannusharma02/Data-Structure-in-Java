package collectionfw;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("java");
        System.out.println(s.add("c"));
        System.out.println(s.add("c"));
        s.add("dotnet");
        s.add("python");
        s.add("sql");
        s.add("nodejs");
        s.add("angularjs");

        for (Object obj : s) {
            System.out.println(obj);
        }
    }
}
