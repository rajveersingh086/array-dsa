public class subarraysumk {
    static int subarraysum (int arr[] ,int k ){
        int n = arr.length;
        int sum = 0;
        int maxsum=0;

        // brute force app O(n*k)

        // for (int i = 0;i<n-k;i++){
        //     int currsum=0;
        //     for (int j =i;j<i+k;j++){
        //         currsum +=arr[j];

        //     }
        //     if(currsum > sum){
        //         sum = currsum;
        //     }
        // }
        // return sum;

        //optimal O(n) sliding window
        for (int i=0;i<k;i++){
            sum += arr[i];
        }
        for (int j=k;j<n;j++){
            sum +=arr[j];
            sum -= arr[j-k];
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
    public static void main (String args []){
        int arr[] ={2,1,5,1,3,2};
        int k = 3;
        System.out.println(subarraysum(arr,k));
    }
}
