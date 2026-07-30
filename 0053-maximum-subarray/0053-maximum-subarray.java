class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int val:nums){
            if(sum<0) sum=0;
            sum+=val;
            max=Math.max(max,sum);
        }
        return max;
    }
}