package Lec_2;

public class sumOFdigit {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
