class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length <= 1) return nums;
        int min = -50000;
        int max = 50000;
        int count[] = new int[max - min + 1];
        for(int i : nums){
            count[i - min]++;
        }
        int idx = 0;
        for(int i = 0 ; i < max - min + 1 ; i++){
            while(count[i]>0){
                nums[idx] = i + min;
                idx++;
                count[i]--;
            }
        }
        return nums;
    }
}