package Array;

public class sumOfArray {
    public static void main(String[] args) {
        int arr[]={12,54,78,63};
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        printArrSum(sum);
    }
    public static void  printArrSum(int sum){
        System.out.println("Sum Of Array : "+sum);
    }
}
