package arrarys;

public class Demo4 {
    public static void main(String[] args) {
        int[] a1 = {2,5,7};
        int[] a2 = {4,6,8,9};
        m1(a1);
        m1(a2);
    }

    static void  m1(int[] a) {
        for(int num:a)
            System.out.print(num + " ");
        System.out.println();
    }

}
