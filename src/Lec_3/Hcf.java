package Lec_3;

public class Hcf {
    public static void main(String[] args) {
        int divisor=10;
        int dividend=20;
        int rem=0;
        while(dividend%divisor!=0){
            rem=dividend%divisor;
            divisor=rem;
            dividend=divisor;
        }
        System.out.println(divisor);
    }
}

