package org.example;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TeesetExample {

    public static void main(String[] args){
        Set<Integer> treeset = new TreeSet<>();

        treeset.add(4);
        treeset.add(6);
        treeset.add(2);
        treeset.add(8);
        System.out.println(treeset);
        treeset.add(6);
        System.out.println(treeset);

        Set<String> newTreeSet = new TreeSet<>(Comparator.comparing(String::length));
        newTreeSet.add("sda");
        newTreeSet.add("ds");
        newTreeSet.add("q");
        System.out.println(newTreeSet);
        newTreeSet.add("ffff");
        System.out.println(newTreeSet);
        System.out.println(newTreeSet.remove("q"));
        System.out.println(newTreeSet);


    }

}
