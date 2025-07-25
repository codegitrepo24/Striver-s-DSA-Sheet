package Patterns;

import java.util.Scanner;

/*
1234
123
12
1
 */
public class InvertedNumberTriangle {
    public static void printInvertedNumberTriangle(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<r-i+1;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows: ");
    int r = sc.nextInt();

    System.out.println("Number Triangle is : ");
    printInvertedNumberTriangle(r);

    sc.close();
   }
}
