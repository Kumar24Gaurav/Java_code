package Lec_2;

public class Pattern_Lb10 {
    public static void main(String[] args) {
        int n=4;
                for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print((char)('A'+row+col-2));
            }
            System.out.println();
        }
    }
}
