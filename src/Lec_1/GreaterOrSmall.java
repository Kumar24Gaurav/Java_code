package Lec_1;

public class GreaterOrSmall {
    public static void main(String[] args) {
        int a=57;
        int b=17;
        int c=21;
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>c && b>a){
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
}
