package dataStructure;

public class MyArrayListTest1 {

    public static void main(String[] args) {
        MyArrayList al1 = new MyArrayList();

        System.out.println(al1);

        al1.add("java");
        al1.add("c");
        al1.add("c++");
        al1.add("python");
        al1.add("sql");
        al1.add("html");

        System.out.println("size = " + al1.size());

        al1.remove("javascript");
        System.out.println(al1);

        System.out.println("size = " + al1.size());
        for (int i = 0; i < al1.size(); i++) {
            String str = (String)al1.get(i);
            System.out.println(str);
        }

    }

}
