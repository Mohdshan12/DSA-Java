/* 
 *  *********  space 0,1,2,3,4,5
     *******
      *****
       ***
        *
 */
package PattrenPrograme;
import java.util.Scanner;
public class Pattren9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 1;
       for(int row = 0;row < n;row++) {
        for(int col = 0;col < row;col++){
            System.out.print(" ");
        }
        for(int col = 0;col<2*n-count;col++) {
            System.out.print("*");
        }
        count = count + 2;
        System.out.println();
       }
    }
    
}
