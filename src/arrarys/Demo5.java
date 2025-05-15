package arrarys;

public class Demo5 {

    public static void main(String[] args) {
        int[] a1 = {3,4,5};
        m1(a1);
//        for(int n:a1) System.out.print(n + " ");
        Demo4.m1(a1);
    }

    static void  m1(int[] a) {
        a[0]=10;
    }
}
