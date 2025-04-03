public class smallELe {
    public static int smaller(int[]arr ,int target){
        int n = arr.length;
        int ans =-1;
        for (int i=0;i<n;i++){
            if(arr[i]==target){
                ans=target;
                break;
            }
            else if(arr[i]<target) ans = arr[i];
            else{
                break;
            }
        }
        return ans;
    }
    public static void main (String args[]){
        int []arr = {2,5,8,9,11};
        int target = 6;
        System.out.println("number smaller than target:" + smaller(arr,target));
    }
}
