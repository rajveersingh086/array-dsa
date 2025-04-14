public class eqilbilumindex {
    public int pivotIndex(int[] nums) {
        int sum =0;
        int n = nums.length;
        for (int i =0;i<n;i++){
            sum += nums[i];
        }
        int leftsum = 0;
        for(int i=0;i<n;i++){
            int rightsum = sum - leftsum - nums[i];
            if (rightsum == leftsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}