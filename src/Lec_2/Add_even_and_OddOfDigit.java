package Lec_2;

public class Add_even_and_OddOfDigit {
    public static void main(String[] args) {
        int n=12345;
        int sum1=0;
        int sum2=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                sum1=sum1+rem;
            }
            else{
                sum2=sum2+rem;
            }
            n/=10;
        }
        System.out.println("Even sum: "+sum1);
        System.out.println("Odd sum: "+sum2);
    }
}
