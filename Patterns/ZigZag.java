package Patterns;

import java.util.Scanner;

/*


  *   *
 * * * *
*   *   *

Observation:

1. Total number of rows = n
2. Leading spaces in each row = n - i (for center alignment)

3. Star and space pattern:
   - For odd rows (like row 1 and 3), there are 3 spaces between stars.
   - For even rows (like row 2), there is 1 space between stars.

4. For each row:
   a) Print (n - i) leading spaces
   b) Loop from j = 1 to i:
      - Print '*'
      - If not the last star in that row (j != i), then:
          - If row is even (i % 2 == 0), print 1 space between stars
          - If row is odd (i % 2 != 0), print 3 spaces between stars

5. After printing all stars in a row, go to next line.
6. This pattern combines:
   - Center alignment (like a pyramid)
   - Custom space logic between stars (based on odd/even rows)

 */


public class ZigZag {
    public static void printZigZag(int r){
for (int i = 1; i <= r; i++) {
        // Leading Spaces
        for (int s = 1; s <= r - i; s++) {
            System.out.print(" ");
        }

        // Internal pattern
        int totalStars = (i % 2 == 0) ? 4 : 2;  // Even -> 4 stars, Odd -> 2 stars
        int spaceBetween = (i % 2 == 0) ? 1 : 3;
        for (int j = 1; j <= totalStars; j++) {
            System.out.print("*");
            if (j != totalStars) {
                for (int sp = 1; sp <= spaceBetween; sp++) {
                    System.out.print(" ");
                }
            }
        }

        System.out.println();
      
      }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("====== ZigZag ======");
        printZigZag(r);
        sc.close();
    }
}
