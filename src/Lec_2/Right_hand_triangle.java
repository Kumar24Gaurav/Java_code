package Lec_2;

public class Right_hand_triangle {
    public static void main(String[] args) {
        int n=5;
        for(int row=0; row<n; row++){
            //spaces
            for(int col=0; col<n-1-row;col++){
                System.out.print("  ");
            }
            //stars
            for(int col=0; col<row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
