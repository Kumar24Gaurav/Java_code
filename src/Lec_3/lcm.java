package Lec_3;

public class lcm {
    public static void main(String[] args) {
        int divisor=10;
        int dividend=20;
        int rem=0;
        //HCF
        while(dividend%divisor!=0){
            rem=dividend%divisor;
            divisor=rem;
            dividend=divisor;
        }
        int hcf=divisor;
        System.out.println(hcf+" hcf");
        //LCM = (a*b)/HCF
        int lcm= (divisor*dividend) / hcf;
        System.out.println(lcm+" lcm");
    }
}
