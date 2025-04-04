public class targLargeFind {
    public static int findele(int []arr,int target ){
        int n = arr.length;
    //     for (int i =0;i<n;i++){
    //         if(arr[i]==target){
    //             return i;
    //         }
    //         else if(arr[i]>target){
    //             return i;
    //         }
    //     }
    //     return -1;
        // in binary search O(logn)!!!
        int low =0 ;int high =n-1;
        int mid = low +(high-low)/2;
        while (low<high){
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
}
    public static void main (String args []){
        int arr[] ={1,3,5,6};
        int target = 2;
        System.out.println("element found :"+ findele(arr, target));
    }
    
}
