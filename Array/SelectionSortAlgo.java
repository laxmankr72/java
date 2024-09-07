package Array;

import java.util.Scanner;

public class SelectionSortAlgo {
    public static int[] Sorting(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[min]>arr[j]){
                     min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;

    }

    public static void printarray(int arr[]){
        for(int  i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
