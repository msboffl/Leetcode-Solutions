class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int evenCount = 0;
        for(int i = 0; i < n; i++) {
            int count = 0;
            int num = nums[i];
            while(num > 0) {
               int rem = num % 10;
               count++;
               num = num / 10;
            }
            if(count % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}