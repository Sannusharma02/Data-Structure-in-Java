package collectionfw;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("java");
        a.add("c");
        a.add("dotnet");
        a.add("python");
        a.add("sql");
        a.add("nodejs");
        a.add("angularjs");

        Collections.sort(a);
        for(Object obj:a) {
            System.out.println(obj);
        }
    }
}
