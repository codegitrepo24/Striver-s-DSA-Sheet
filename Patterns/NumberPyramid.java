package Patterns;

import java.util.Scanner;

/*
 
   1
  121
 12321

 */
public class NumberPyramid {
    public static void printNumberPyramid(int r) {

    
        for (int i = 1; i <= r; i++) {
            // Spaces before the numbers = r-i for each row i.
            for (int s = 1; s <= r - i; s++) {
                System.out.print(" ");
            }
            // Incresing the numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing the numbers from i - 1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("====== NumberPyramid ======");
        printNumberPyramid(r);
        sc.close();
    }
}
