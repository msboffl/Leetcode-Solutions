class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positives = new int[n/2];
        int[] negatives = new int[n/2];
        
        int ps = 0, ns = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                positives[ps] = nums[i];
                ps++;
            } else {
                negatives[ns] = nums[i];
                ns++;
            }
        }
        
        for(int i = 0; i < n / 2; i++) {
            nums[2 * i] = positives[i];
            nums[2 * i + 1] = negatives[i];
        }
        return nums;
        
    }
}