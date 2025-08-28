package Collections.List;

import java.util.LinkedList;

// Q2. Create an LinkedList of integers, add 5 elements, print them using for-each loop ,then access element at index 2.
public class AddFiveElementsUsingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println("NUMBERS : ");
        for (int n : numbers) {
            System.out.println(n);
        }

        int indextwo = numbers.get(2);
        System.out.println("element at index 2: " + indextwo);

    }
}
