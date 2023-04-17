package com.cydeo;

import java.util.Deque;
import java.util.LinkedList;

public class StackInterviewQuestion {

    public static void main(String[] args) {

        System.out.println(symbolBalancing("(A*C) + {V-M}")); // true  -> () + {}
        System.out.println(symbolBalancing("(A*C)) + {V-M}"));// false -> ()) + {}
        System.out.println(symbolBalancing("((A+B)+[C-D]}")); // false

    }

    public static boolean symbolBalancing(String expr) {

        // create stack
        Deque<Character> stack = new LinkedList<>();

        // iterate the whole expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);

            // filter all non symbol chars ( (),[],{} -> ONLY )
            if (ch != '(' && ch != ')' && ch != '{' && ch != '}' && ch != '[' && ch != ']') continue;

            // check if it's an "OPENING" symbol if it is -> push() to Stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }

            // if no symbols are in stack (nothing to compare)
            if (stack.isEmpty()) return false;

            // checking 'CLOSING' symbols to see if they have an 'OPENING' counter-part in the stack
            switch (ch){
                case ')':
                    if (stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.pop() != '[') return false;
                    break;
            }

        }

        // return True if stack isEmpty

        return stack.isEmpty();

    }

}
