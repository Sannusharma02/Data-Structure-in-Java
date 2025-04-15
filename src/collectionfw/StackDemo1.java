package collectionfw;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
