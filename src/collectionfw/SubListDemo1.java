package collectionfw;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo1 {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("java");
        a.add("c");
        a.add("dotnet");
        a.add("python");
        a.add("sql");
        a.add("nodejs");

        List<String> a1 = a.subList(1, 5);
        System.out.println("a="+a);
        System.out.println("a1="+a1);

    }
}
