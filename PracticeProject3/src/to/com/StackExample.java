package to.com;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        
        stack.push(130);
        stack.push(2330);
        stack.push(303);
        stack.push(404);
        stack.push(5067);

        System.out.println("Stack after inserting : " + stack);

        
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after removing : " + stack);

        
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peeking : " + stack);
    }
}
