package Array;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number for index "+i+" : ");
            int data = sc.nextInt();
            arr[i]=data;
        }
        System.out.println("Array list : ");
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println("Enter the number to search : ");
        int aim = sc.nextInt();
        int res = printAim(arr,aim);
        System.out.println(res);
    }
    public static int printAim(int arr[],int aim){
        int low = 0;
        int high = arr.length-1;

        while(low<=high) {
            int mid = (low+high)/2;
            if (arr[mid] < aim) {
                low = mid + 1;
            } else if (arr[mid] > aim) {
                high = mid - 1;
            } else {
               return mid;
            }
        }
        return -1;
    }
}
