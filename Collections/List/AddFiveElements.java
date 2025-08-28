package Collections.List;

import java.util.ArrayList;

// Q1. Create an ArrayList of integers, add 5 elements, print them using for-each loop.

public class AddFiveElements {
   public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    numbers.add(60);
    numbers.add(70);
    numbers.add(80);
    numbers.add(100);

    System.out.println("NUMBERS: ");
    for(int num: numbers){
        System.out.println(num);
    }



   } 
}
