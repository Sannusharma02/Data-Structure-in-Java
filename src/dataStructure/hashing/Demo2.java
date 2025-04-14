package dataStructure.hashing;

class Node1 {
    Object e;
    Node1 next;

    Node1(Object e, Node1 next) {
        this.e = e;
        this.next = next;
    }
}

class MySet1 {
     private Node1[] a = new Node1[16];
     private int count = 0;

    private int hash(Object obj) {
        return obj.hashCode() % 16;
    }

     public boolean add(Object e) {
         int index =hash(e);
         if (a[index] == null) {
             a[index] = new Node1(e, null);
             count++;
             return true;
         }
         Node1 currNode =a[index];
         while(true) {
             if(currNode.e.equals(e)) return false;
             if( currNode.next == null) {
                 currNode.next = new Node1(e, null);
                 count++;
                 return true;
             }
             currNode =currNode.next;
         }
     }

     public int size() {
         return count;
     }

    public String toString() {
        if (size() == 0) return "[]";
        String str = "[";
        for (Node1 node1 : a) {
            Node1 current = node1;
//            if (node1 != null) continue;
            while (current != null) {
                str += current.e + ", ";
                current = current.next;
            }
        }
        if (str.length() > 1) {
            str = str.substring(0, str.length() - 2);
        }
        str += "]";
        return str;
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public String toString() {
        return "[length=" + length + ", breadth=" + breadth + "]";
    }

    public int hashCode() {
        return length*breadth;
    }

    public boolean equals(Object e) {
        Rectangle r = (Rectangle)e;
        return length == r.length && breadth == r.breadth;
    }
}

public class Demo2 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(4, 2);
        Rectangle r3 = new Rectangle(3, 1);
        Rectangle r4 = new Rectangle(4, 2);

        System.out.println(r2.equals(r4));
        System.out.println(r2.hashCode());
        System.out.println(r4.hashCode());

        MySet1 mySet1 = new MySet1();
        mySet1.add(r1);
        mySet1.add(r2);
        mySet1.add(r3);
        mySet1.add(r4);
        mySet1.add(new String("ab"));
        mySet1.add(new String("cd"));
        mySet1.add(new String("ab"));
        System.out.println(mySet1);  // Should now print [ab, cd]
    }

}
