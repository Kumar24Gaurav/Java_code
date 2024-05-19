package Lec_2;

public class Pattern_Lb11 {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print((char)('A'+row-1));
            }
            System.out.println();
        }
    }
}
