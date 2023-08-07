class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                res[0] = i;
                break;
            }
        }
        for(int i = n-1; i >= 0; i--) {
            if(nums[i] == target) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
}