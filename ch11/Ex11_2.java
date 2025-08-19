package javaStudy.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new LinkedList(); // Queue는 인터페이스의 구현체인 LinkedList

        System.out.println("stack 처음: "+stack); // []
        stack.add("0");
        stack.add("1");
        stack.add("2");
        System.out.println(stack); // [0, 1, 2]
        System.out.println(" == stack for == ");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
        System.out.println();

        System.out.println("queue 처음: "+ queue); // []
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");
        System.out.println(queue);
        System.out.println(" == queue for == ");
        while (!queue.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
