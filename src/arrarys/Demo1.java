package arrarys;

public class Demo1 {

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 50;
        a[1] = 70;
        a[2] = 10;
        a[3] = 40;
        a[4] = 30;

        System.out.println("iterating using for");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("iterating using for each");
        for(int num:a){
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
