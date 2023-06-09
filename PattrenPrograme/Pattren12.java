package PattrenPrograme;
import java.util.Scanner;
public class Pattren12 {
    public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1 = n/2;
    for(int row = 0;row <n1;row++) {
        for(int col = 0;col<row;col++) {
            System.out.print(" ");
        }
        for(int col = 0;col<n1-row;col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int row = 0;row <n1;row++) {
        for(int col = 1;col<n1-row;col++) {
            System.out.print(" ");
        }
        for(int col = 0;col<=row;col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
