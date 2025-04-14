package dataStructure.hashing;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = new String("abcd");
        String s2 = new String("abcd");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
