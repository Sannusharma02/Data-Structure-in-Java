package dataStructure;

public class MyLinkedList {
    private Node first = null;
    private int count = 0;

    public void add(Object e) {
        if (first == null) {
            first = new Node(e, null);
            count++;
            return;
        }
        Node last = first;
        while(last.next != null) {
            last = last.next;
        }
        last.next = new Node(e, null);
        count++;
    }

    public void add(int index, Object e) {
        if(index < 0 || index >= count) {throw new IndexOutOfBoundsException();}
        if(index == 0) {
            first = new Node(e, first);
            count++;
            return;
        }
        Node cuurent = first;
        int i = 1;
        while(i < index) {
            cuurent = cuurent.next;
            i++;
        }
        cuurent.next = new Node(e, cuurent.next);
        count++;
    }

    //need to be done
    public Object set(int index, Object e) {
        return null;
    }


    //need to be done
    public Object remove(int index) {
        return null;
    }

    //need to be done
    public void remove(Object e) {

    }

    public void clear() {
        first= null;
        count=0;
    }

    public Object get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        Node currNode = first;
        int i = 1;
        while (i <= index) {
            currNode = currNode.next;
            i++;
        }
        return currNode.e;
    }

    public int size() {
        return count;
    }


    @Override
    public String toString() {
        if (first == null) {
            return "[]";
        }
        Node currNode = first;
        StringBuilder str = new StringBuilder("[" + currNode.e);

        while (currNode.next != null) {
            currNode = currNode.next;
            str.append(",").append(currNode.e);
        }
        str.append("]");
        return str.toString();
    }
}
