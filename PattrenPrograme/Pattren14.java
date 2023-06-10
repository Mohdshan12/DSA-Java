package PattrenPrograme;
import java.util.Scanner;
public class Pattren14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int row = 0;row < n;row++) {
        if(row == 0) {
            for(int col = 0;col<n*2-1;col++) {
                System.out.print("*");
            }    
        }
        else {
            for(int col = 0;col < row;col++) {
                System.out.print(" ");
            }
            for(int col = 0;col <n-row;col++) {
                if(col == 0 || col == n-row-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }
}
}
