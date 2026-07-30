class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m - 1;
        int index = n - 1;
        int right = m + n - 1;
        while (index >= 0) {
            if (idx >= 0 && nums1[idx] > nums2[index]) {
                nums1[right] = nums1[idx];
                idx--;
            } else {
                nums1[right] = nums2[index];
                index--;
            }
            right--;
        }        
    }
}