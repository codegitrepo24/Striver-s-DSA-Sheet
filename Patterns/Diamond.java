package Patterns;

import java.util.Scanner;

/*
 
   *
  ***
 *****
  ***
   *

 */

public class Diamond {
    public static void printDiamond(int r){
        for(int i=1;i<=r;i++){
            for(int s=1;s<=r-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=r;i>=1;i--){
            for(int s=1;s<=r-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("====== Diamond ======");
        printDiamond(r);
        sc.close();
    }
}
