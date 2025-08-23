package javaStudy.ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
            System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
            System.exit(0);
        }

        Stack stack = new Stack();
        String expression = "((2+3)*1+3";

        System.out.println("expression: " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    stack.push(ch + "");
                } else if (ch == ')') {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("괄호 일치한다");
            }else {
                System.out.println("괄호 일치하지 않는다");
            }
        }catch (EmptyStackException e){
            System.out.println("괄호 일치하지 않는다");
        }
    }
}
