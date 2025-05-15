package arrarys;

public class Demo6 {

    public static void main(String[] args) {
        int[] a = m1();
        for(int num:a)
            System.out.print(num + " ");
    }

    static int[] m1() {
        int[] a = {3,5,7,8,9};
        return a;
    }
}
