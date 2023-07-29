class Solution {
    public int longestConsecutive(int[] a) {
       if(a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;
        int currCount = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] - 1 == lastSmaller) {
                currCount++;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                currCount = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(currCount, longest);
        }
        return longest; 
    }
}