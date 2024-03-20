package Array;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        int num = sc.nextInt();
        int arr[] = new  int[num];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number of index "+i+" : ");
            int data = sc.nextInt();
            arr[i]=data;
        }
        System.out.println("Array list : ");
        for(int a:arr){
            System.out.println(a);
        }
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
         int index[] = targetsum(arr,target);
        if(index.length==2){
            System.out.println(index[0]+" "+index[1]);
        }

    }
    public static int [] targetsum(int arr[],int target){
        int ans[] = new int[2];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }

}
