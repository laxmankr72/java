package Basics;

import java.util.Scanner;

public class findCombination {

//    public static int combination(int n, int r){
//        int factN = 1;
//        for(int i=1;i<=n;i++){
//            factN = factN * i;
//        }
//
//        int factR = 1;
//        for(int i=1;i<=r;i++){
//            factR = factR * i;
//        }
//        int factNR = 1;
//        for(int i=1;i<=n-r;i++){
//            factNR = factNR * i;
//        }
//        int result = factN/(factR * factNR);
//
//        return result;
//    }

    public static int factoril(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int r = sc.nextInt();

       int factN = factoril(n);
       int factR = factoril(r);
       int factNR = factoril(n-r);

      int result = factN/(factR * factNR);
        System.out.println("result:"+result);

    }
}
