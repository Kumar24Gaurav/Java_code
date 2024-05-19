package Lec_2;

public class Pattern_Lb9 {
    public static void main(String[] args) {
        int n=3;
        char ch = 'A';
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
