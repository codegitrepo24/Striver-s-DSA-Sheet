package Patterns;

import java.util.Scanner;

/*
 * Butterfly Pattern Logic (for r rows):
 * 
 * Example (r = 4):
 * *      *
 * **    **
 * ***  ***
 * ********
 * ***  ***
 * **    **
 * *      *
 *
 * Step-by-step approach:
 * 
 * 1. The pattern is symmetric and made of two parts:
 *    - Upper half (1 to r)
 *    - Lower half (r to 1)
 *
 * 2. Each row has three parts:
 *    - Left stars: i stars
 *    - Middle spaces: 2 * (r - i) spaces
 *    - Right stars: i stars
 *
 * 3. The middle spaces shrink as you move down in the upper half,
 *    and expand as you move down in the lower half.
 *
 * 4. The formula '2 * (r - i)' ensures that the gap decreases with increasing stars,
 *    creating the butterfly merge effect in the middle.
 *
 * 5. Lower half is just a mirror of the upper half (in reverse order).
 *
 * 6. Total rows printed: 2 * r
 */


public class Butterfly {
    public static void printButterfly(int r) {
        //upper half
        for (int i = 1; i <= r; i++) {
            // prints left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // prints middle spaces
            for (int j = 1; j <= 2 * (r - i); j++) {
                System.out.print(" ");
            }
            // print right stars
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for(int i=r;i>=1;i--){
            // prints left stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // prints middle-spaces
            for(int j=1;j<=2*(r-i);j++){
                System.out.print(" ");
            }
            // prints right stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("====== Butterfly ======");
        printButterfly(r);
        sc.close();
    }
}
