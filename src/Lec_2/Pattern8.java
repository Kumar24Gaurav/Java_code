package Lec_2;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int row=0; row<2*n-1;row++){
            //spaces
            for(int col=0; col<2*row-(4*count); col++){
                System.out.print("  ");
            }
            //stars
            for(int col=0;col<n-row+2*count;col++){
                System.out.print("* ");
            }
            if(row>=n-1){
                count++;
            }
            System.out.println();
        }
    }
}
