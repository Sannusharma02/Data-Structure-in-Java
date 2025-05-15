package arrarys;

public class Demo7 {

    public static void main(String[] args) {
        String[] a1 = new String[4];
        a1[0]="java";
        a1[1]="python";
        a1[2]="c++";
        a1[3]="c";
        for(String s:a1)
            System.out.println(s + " ");

        System.out.println(a1[0].length());
        System.out.println(a1[1].charAt(0));
    }
}
