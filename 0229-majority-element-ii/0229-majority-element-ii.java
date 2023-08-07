class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(ls.size() == 0 || ls.get(0) != nums[i]) {
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if(nums[i] == nums[j]) {
                        count++;
                    }
                }
                if(count > n / 3) {
                    ls.add(nums[i]);
                }
            }
            if(ls.size() == 2) break; 
        }
        return ls;
    }
}