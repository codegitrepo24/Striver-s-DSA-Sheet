package Patterns;

import java.util.Scanner;

/*
 
*****
*   *
*****

 */
public class HollowRectangle {
    public static void printHollowRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {

                if (i == 1 || i == r) {
                    System.out.print("*");
                } else if (j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int r = sc.nextInt();

        System.out.print("Enter the breadth: ");
        int c = sc.nextInt();

        System.out.println("======= HOLLOW RECTANGLE =========");
        printHollowRectangle(r, c);
        sc.close();
    }
}
