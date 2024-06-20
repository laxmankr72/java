package _2DArray;
import java.util.Scanner;

public class RectangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n: ");
        int n = sc.nextInt();

        System.out.println("m: ");
        int m = sc.nextInt();


        int arr[][] = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+1+" ");
            }
            System.out.println();
        }
    }
}
