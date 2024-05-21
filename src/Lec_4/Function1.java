package Lec_4;

public class Function1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(Add(a,b));
    }
    public static int Add(int a, int b){
        int c=a+b;
        return c+sub();
    }
    public static int sub(){
        int a=20;
        int b=20;
        int c=b-a;
        return c;
    }
}
