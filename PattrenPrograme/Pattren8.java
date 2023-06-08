/*
 *      *    0 1
       ***   1  3
      *****  2  5
     ******* 3  7
    *********
 */
package PattrenPrograme;
import java.util.Scanner;
public class Pattren8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
       for(int row = 1;row <= n;row++) {
        
        for(int col = 0;col< n-row;col++) {
            System.out.print(" ");
        }
        for(int col = 0;col < 2*count + 1;col++) {
            System.out.print("*");
        }
        count++;
        System.out.println();
       }
    }
    
}
