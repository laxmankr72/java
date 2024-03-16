package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the value of Array: ");
        int num;

        for(int i = 0;i<arr.length;i++) {
            num = sc.nextInt();
            arr[i] = num;
        }
        printArr(arr);
    }
    public static void printArr(int arr[]){
        System.out.print("Array list : ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.print("Reverse Array list: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
