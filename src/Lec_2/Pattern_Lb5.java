package Lec_2;

public class Pattern_Lb5 {
    public static void main(String[] args) {
        int n=4;
        int count=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
