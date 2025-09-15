package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args){

        Deque<String> stack = new ArrayDeque<>();
        stack.push("First Request");
        stack.push("Second reqest");
        stack.push("Third reqeust");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.poll());
        System.out.println(stack);


    }
}
