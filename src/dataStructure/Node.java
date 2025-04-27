package dataStructure;

public class Node {
    Object e;
    Node next;

    public Node(Object e, Node next) {
        this.e = e;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + e + "]";
    }

}
