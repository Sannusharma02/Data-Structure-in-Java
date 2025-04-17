package collectionfw;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {

    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<Object>();
        queue.add(30);
        queue.add(50);
        queue.add(10);
        queue.add(40);
        queue.add(20);

        while(queue.peek()!=null){
            System.out.println(queue.poll());
        }
    }
}
