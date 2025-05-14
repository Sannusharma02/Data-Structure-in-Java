package arrarys;

public class Demo3 {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = a;
        a[0] = 50;
        System.out.println(b[0]);
    }
}
