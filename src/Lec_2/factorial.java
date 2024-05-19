package Lec_2;

public class factorial {
    public static void main(String[] args) {
        int i=5;
        int fact=1;
        while(i>=1){
            fact*=i;
            i--;
        }
        System.out.println(fact);
    }
}
