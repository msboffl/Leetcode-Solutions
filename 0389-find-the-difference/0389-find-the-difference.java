class Solution {
    public char findTheDifference(String s, String t) {
        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();
        
        Arrays.sort(sortS);
        Arrays.sort(sortT);
        
        int i = 0;
        while(i < s.length()) {
            if(sortS[i] != sortT[i]) {
                return sortT[i];
            }
            i++;
        }
        return sortT[i];
    }
}