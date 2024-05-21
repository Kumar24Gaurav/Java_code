package Lec_5;
import java.util.*;
public class arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<=size/2;i++) {
            int a = arr[i];
            int b = arr[size-1-i];
            //swapping
            int c=a;         // int c=arr[i]
            a=b;             // arr[i]=arr[n-1-i]
            b=c;             // arr[n-1-i] = c;
            //swapped value assigned
            arr[i]=a;
            arr[size-1-i]=b;
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
