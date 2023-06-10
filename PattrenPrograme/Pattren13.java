package PattrenPrograme;
import java.util.Scanner;
public class Pattren13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1;row <= n;row++) {
            if(row != n) {
            for(int col = 0;col < n-row;col++) {
                 System.out.print(" ");
            }
            for(int col = 0;col<row;col++) {
                if(col == 0 || col==row-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }
        else {
            for(int col =0;col<row*2-1;col++) {
            System.out.print("*");
        }
        }
            System.out.println();
        }
    }
    
}
