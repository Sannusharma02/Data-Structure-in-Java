package comparingobjects;

public class Test1 {
    public static void main(String[] args) {
        Triangle t1=new Triangle(10,20);
        Triangle t2=new Triangle(10,20);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
    }
}
