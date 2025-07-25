package Patterns;

import java.util.Scanner;

/*
 
*
**
***
****

 */
public class RightangledTriangle {
    public static void printRightangledTriangle(int r){
    for(int i=1; i<=r; i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }   
    } 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();

        System.out.println("======== RIGHT ANGLED TRIANGLE ========");
        printRightangledTriangle(r);

        sc.close();
    }
}
