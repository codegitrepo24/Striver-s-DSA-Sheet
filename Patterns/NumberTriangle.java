package Patterns;

import java.util.Scanner;

/*
 
1
12
123
1234

 */
public class NumberTriangle {
   public static void printNumberTriangle(int r){
    for(int i=1;i<=r;i++){
        for(int j=1;j<=i;j++){
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
    printNumberTriangle(r);

    sc.close();
   }
}
