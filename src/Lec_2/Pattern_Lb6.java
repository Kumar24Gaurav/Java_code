package Lec_2;

public class Pattern_Lb6 {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            int value=row;
            for(int col=1; col<=row; col++){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
