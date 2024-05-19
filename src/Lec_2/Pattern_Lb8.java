package Lec_2;

public class Pattern_Lb8 {
    public static void main(String[] args) {
        int n=3;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                char ch = (char)('A'+col-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
