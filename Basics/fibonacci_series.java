import java.util.*;

public class fibonacci_series{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int next;

        for(int i=2; i<=n; i++){
            next = a+b;
            a=b;
            b=next;            
        }
            System.out.print(b+" ");

    }
}