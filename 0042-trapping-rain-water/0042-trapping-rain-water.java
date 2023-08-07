class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        for(int i = 1; i < n-1; i++) {
            int left_max = 0;
            int right_max = 0;
            for(int j = i; j >= 0; j--) {
                left_max = Math.max(left_max, height[j]);
            }
            for(int j = i; j < n; j++) {
                right_max = Math.max(right_max, height[j]);
            }
            ans += Math.min(left_max, right_max) - height[i];
        }
        return ans;
    }
}