package Patterns;

import java.util.Scanner;

/*
 
1
2 3
4 5 6

 */
public class FloydsTriangle {
    public static void printFloydsTriangle(int r){
        int n = 1; // Starting number
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("====== FloydsTriangle ======");
        printFloydsTriangle(r);
        sc.close();
    }
}
