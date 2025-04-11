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
    private Node[] a = new Node[16];
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
        Node previousNode = null;
        while(currNode!=null){
            if(currNode.num == num){
                return false;
            }
            previousNode = currNode;
            currNode = currNode.next;
        }
        previousNode = new Node(num, null);
        count++;
        return true;
    }
}

public class demo1 {

    public static void main(String[] args) {
        MySet set = new MySet();
        set.add(26);
        set.add(42);
        System.out.println(set);
    }
}
