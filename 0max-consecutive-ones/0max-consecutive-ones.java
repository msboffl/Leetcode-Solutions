class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int n = nums.length;
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                count += 1;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(count, maxCount);
    }
}