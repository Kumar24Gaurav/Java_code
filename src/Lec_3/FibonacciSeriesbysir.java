package Lec_3;

public class FibonacciSeriesbysir {
    public static void main(String[] args) {
        int n=6;
        int prev=0;
        int curr=1;
        for(int i=0;i<n;i++){
            System.out.print(prev+" ");
            int c=curr+prev;
            prev=curr;
            curr=c;
        }
        System.out.println(prev);
    }
}
