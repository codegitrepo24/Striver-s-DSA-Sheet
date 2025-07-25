package Patterns;

import java.util.Scanner;

/* 

*****
*****
*****

*/ 

public class SolidRectagle {
    public static void printSolidRectangle(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int r = sc.nextInt();

        System.out.println("Enter the breadth: ");

        int c = sc.nextInt();
        
        System.out.println("Solid Rectangle Pattern: " );
        printSolidRectangle(r, c);

        sc.close();

    }
}
