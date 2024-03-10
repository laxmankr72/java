package Basics;

import java.util.Scanner;

public class fibonacciMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean res = checkMember(n);
        System.out.println(res);
    }

    public static boolean checkMember(int n) {
        int a = 0;
        int b = 1;

        while (a < n) {
            int c = a + b;
            a = b;
            b = c;
        } return a==n;

    }
}
