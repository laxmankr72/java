package Array;

import java.util.Scanner;

public class linearSearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int num = sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data for index "+i+" : ");
            int data = sc.nextInt();
            arr[i]=data;
        }
        System.out.print("Array list is : ");
        for(int a:arr){
            System.out.println(a);
        }

        System.out.println("enter data to search in Array list:  ");
        int ToFind = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ToFind){
                flag = true;
                break;
            }

        }
        System.out.println(flag);
    }
}
