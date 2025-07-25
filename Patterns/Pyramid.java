package Patterns;

import java.util.Scanner;

/*

   *  
  *** 
 *****

 */
public class Pyramid {
    public static void printPyramid(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows: ");
    int r = sc.nextInt();

    System.out.println("Number Triangle is : ");
    printPyramid(r);

    sc.close();
   }
}
