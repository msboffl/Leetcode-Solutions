class Solution {
    public char findTheDifference(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);
        
        int i = 0; 
        while(i < s.length()) {
            if(charArrayS[i] != charArrayT[i]) {
                return charArrayT[i];
            }
            i++;
        }
        return charArrayT[i];
    }
}