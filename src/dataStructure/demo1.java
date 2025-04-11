package dataStructure;

class Node{
    int num;
    Node next;
    Node(int num, Node next){
        this.num = num;
        this.next = next;
    }
}

class MySet{
    private final Node[] a = new Node[16];
    private int count = 0;

    private int hash(int num){
        return num % 16;
    }

    public boolean add(int num){
        int index = hash(num);
        if(a[index] == null) {
            a[index] = new Node(num, null); // not directly storing number we are using linked list
            count++;
            return true;
        }

        Node currNode = a[index];
        while(true){
            if(currNode.num == num){
                return false;
            }
            if(currNode.next == null){
                currNode.next = new Node(num, null);
                count++;
                return true;
            }
            currNode = currNode.next;
        }
    }

    public int size(){
        return count;
    }

    public String toString() {
        if (size()==0) return "[]";
        StringBuilder str = new StringBuilder("[");
        for (Node node : a) {
            Node first = node;
            if (node == null) continue;
            while (first != null) {
                str.append(first.num).append(", ");
                first = first.next;
            }
        }
        str = new StringBuilder(str.substring(0, str.length() - 2));
        str.append("]");
        return str.toString();
    }
}

public class demo1 {

    public static void main(String[] args) {
        MySet set = new MySet();
        System.out.println(set.add(26));
        System.out.println(set.add(42));
        System.out.println(set.add(58));
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println("size = "+set.size()+", set = "+ set);
    }
}
