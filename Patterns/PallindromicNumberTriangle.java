package Patterns;

import java.util.Scanner;

/*
 
    1
   121
  12321
 1234321

 */
public class PallindromicNumberTriangle {
  public static void printPallindromicNumberTriangle(int r){
    for(int i=1;i<=r;i++){
        for(int s=1;s<=r-i;s++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int j=i-1;j>=1;j--){
            System.out.print(j);
        }

        System.out.println();
    }
  }
  
  public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("====== Pallindromic Number Triangle ======");
        printPallindromicNumberTriangle(r);
        sc.close();
    }
}
