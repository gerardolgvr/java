package dev.gerardo.exercises.stacks;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(String.valueOf(s.charAt(i)));
            } else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                String opposite = "";
                if(s.charAt(i) == ')'){
                    opposite = "(";
                } else if(s.charAt(i) == '}'){
                    opposite = "{";
                } else if(s.charAt(i) == ']'){
                    opposite = "[";
                }

                if(!stack.isEmpty() && opposite.equals(stack.peek())){
                    stack.pop();
                } else {
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
        }

        String res = "";
        if(stack.size() == 0){
            res = "YES";
        } else {
            res = "NO";
        }
        return res;
    }
}
