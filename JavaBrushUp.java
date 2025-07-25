import java.io.*;
import java.util.*;

class Person {
    String name;
    int age;

    // Construtor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");

    }
}

public class JavaBrushUp {
    // Function (with Recursion)
    public static int factorial(int n){
        if(n<=1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws IOException{
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Data Types & Loops + Arrays
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // String input
        sc.nextLine(); // consume newLine
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        //Class/Object
        Person kundan = new Person(name, 23);
        kundan.greet();

        // Collections (List)
        List<Integer> list = new ArrayList<>();
        for(int x :  arr) list.add(x);

        // Sorting
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Collections (Map)
        Map<String, Integer> map = new HashMap<>();
        map.put("Sum", Arrays.stream(arr).sum());
        map.put("Max", Arrays.stream(arr).max().getAsInt());

        System.out.println("Map Values: " + map);

        // Recursion usage
        System.out.print("Factorial of 5 is : " + factorial(5));




    }
}