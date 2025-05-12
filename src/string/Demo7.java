package string;

public class Demo7 {
    public static void main(String[] args) {
//        String s1 = "java";
        final String s1 = "java";
        String s2 = "javadev";
        String s3 = s1+"dev";
        System.out.println(s2==s3); // const + const is true but variable + constant is false, in here final make it const
    }
}
