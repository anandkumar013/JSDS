package org.example;

import java.util.LinkedList;

public class LinkedListExamples {
    public  static void main(String[] args){

        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1, "Mango");
        System.out.println(shoppingList);
        shoppingList.add(0, "AMango");
        System.out.println(shoppingList);

        shoppingList.add(   4, "AMango");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);



    }
}
