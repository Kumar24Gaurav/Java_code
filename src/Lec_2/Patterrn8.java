package Lec_2;
import java.util.*;
public class Patterrn8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 0; row <=2 * n; row++) {
            if (row <= n) {
                for (int col = 0; col <=row; col++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int col = 0; col <= 2 * n- row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
