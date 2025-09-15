package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args){
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Pass one");
        queue.offer("Pass two");
        queue.offer("Pass three");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
