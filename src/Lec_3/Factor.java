package Lec_3;

public class Factor {
    public static void main(String[] args) {
        int n=20;
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
