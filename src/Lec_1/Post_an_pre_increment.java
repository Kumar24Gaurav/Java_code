package Lec_1;

public class Post_an_pre_increment {
    public static void main(String[] args) {
        int a=6;
        //int b=a++ + a-- + ++a - ++a + a;
        // 6 + 7 + 7 - 8 + 8
        int c= a++ + a++ - ++a + ++a + --a;
        //6 + 7 - 9 + 10 + 9
        System.out.println(c);
    }
}
