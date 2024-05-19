package Lec_2;

public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            //space
            for(int col=2;col<=row;col++){
                System.out.print("  ");
            }
            //stars
            for(int col=row; col<=2*n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
