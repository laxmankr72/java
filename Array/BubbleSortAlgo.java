package Array;

import java.util.Scanner;

public class BubbleSortAlgo {

    public static int[] Sorting(int arr[]){

        for(int term=0;term<arr.length-1;term++){
            for(int j=0;j<arr.length-1-term;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

    }

    public static void printarray(int arr[]){
        for(int  i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       int sortedarr[] = Sorting(arr);
        printarray(sortedarr);
    }

}
