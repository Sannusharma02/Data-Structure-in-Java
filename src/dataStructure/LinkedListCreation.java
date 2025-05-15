package dataStructure;

public class LinkedListCreation {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(2,50);
        System.out.println(l);
        System.out.println((Integer)l.get(0));
    }
}
