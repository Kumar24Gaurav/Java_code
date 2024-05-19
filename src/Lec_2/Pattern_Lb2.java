package Lec_2;

public class Pattern_Lb2 {
    public static void main(String[] args) {
        int n=3;
        int count=1;
        for(int row=1;row<=n;row++){
            for(int col=1; col<=n;col++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
