package Array;

public class lowerBond {
    public static void main(String[] args) {
        int arr[]={1,2,2,5,5,5,6};
        int data= 5;
        System.out.println(findLowerBond(arr,data));
    }
    public static int findLowerBond(int arr[] , int data){
        int lo = 0;
        int hi = arr.length-1;
        int res = -1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==data){
                res=mid;
                hi = mid -1;
            }
            else if (arr[mid]<=data) {
                hi = mid -1;
            }
            else
                lo = mid +1;
        }
        return res;
    }
}
