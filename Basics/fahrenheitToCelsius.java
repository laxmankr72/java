package Basics;

import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Start = sc.nextInt();
        int End = sc.nextInt();
        int Step = sc.nextInt();

        convert(Start, End, Step);
    }

    public static void convert(int S, int E, int St) {

        for (int i = S; i <= E; i += St) {

            int Celsius = (i - 32) * 5 / 9;

            System.out.println(i + " " + Celsius);

        }

    }
}
