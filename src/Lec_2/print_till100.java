package Lec_2;

public class print_till100 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=100){
            sum=sum+i;
            System.out.println(i);
            i++;
        }
        System.out.println(sum);
    }
}
