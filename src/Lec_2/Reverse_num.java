package Lec_2;

public class Reverse_num {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        while(n>0){
            int rem=n%10;
            System.out.print(rem);
            n/=10;
        }
    }
}
