package Patterns;

import java.util.Scanner;

/*
 
****
***
**
*

 */
public class RightangledTriangleDec {
    public static void printRightangledTriangleDec(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int r = sc.nextInt();

        System.out.println("The Right Angled Triangle in decreasing: ");
        printRightangledTriangleDec(r);
        sc.close();
    }

}
