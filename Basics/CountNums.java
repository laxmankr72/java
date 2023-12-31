import java.util.*;

public class CountNums{
    public static void main(String as []){
        Scanner sc = new Scanner(System.in);

        int count=0;
        int rem ;
      System.out.print("Enter numbers: ");  
        int num = sc.nextInt();
      System.out.print("Enter number that you want to count: ");  
        int n = sc.nextInt();

        while(num>0){
          rem=num%10;
          if(rem==n){
            count++;
          } 
          num=num/10;
        }
      System.out.print(n+" counts "+count+" times");  
    }
}