package Lec_2;

public class Patter_Lb1 {
    public static void main(String[] args) {
        int n=3;
        int row=1;
        while(row<=n){
            int j=1;
            while(j<=n){
                System.out.print(n-j+1);
                j++;
            }
            System.out.println();
            row++;
        }
    }
}
