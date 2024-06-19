//Square Matrix - Single Test Case
//        Input
//        • The first line of the input contains N the dimensions of the square matrix
//        • The next N lines contains N space separated integers, denoting the elements of the matrix
//        Output
//        • Print the elements of the matrix row by row, by adding 1 to each element, as shown in the sample test case
//
//        You have to take input by yourself  and out put should be like this not in string it should be number
//
//        Sample Input 1
//        3
//        1 2 3
//        4 5 6
//        7 8 9
//
//        Sample Output 1
//
//        2 3 4
//        5 6  7
//        8 9 10

        package _2DArray;
import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int [n][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+1+" ");
            }
            System.out.println();
        }
    }
}
