package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"M","T","W"};
        System.out.println(Arrays.toString(weekdays));

        for(String day:weekdays)
            System.out.println(day);
        for (int i=0 ; i<weekdays.length;i++){
            weekdays[i] = weekdays[i].toLowerCase();
            //System.out.println(weekdays[i]);
        }
        System.out.println(Arrays.toString(weekdays));
        int[] tges = new int[]{8, 18, -12, 20, 6};
        System.out.println(Arrays.toString(incrementArray(tges)));
    }

    static int[] incrementArray(int[] numbers) {

        for(int i= 0 ; i < numbers.length ; i++){
            numbers[i] = numbers[i]+1;
        }
        return  numbers;
    }

}
