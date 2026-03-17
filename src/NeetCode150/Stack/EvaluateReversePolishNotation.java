package NeetCode150.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for ( String i : tokens){
            if (i.equals("+")){
                stack.push(stack.pop()+stack.pop());
            } else if (i.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (i.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (i.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();

    }

    public static void main(String[] args) {
        String[] input = {"1","2","+","3","*","4","-"};
        int res = evalRPN(input);
        System.out.println("The Evaluated Reverse Polish Notation result is : " + res);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
