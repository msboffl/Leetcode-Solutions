class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        
        int i = 0; // word1 --> Pointer
        int j = 0; // word2 --> Pointer
        String ans = "";
        while(i < n1 && j < n2) {
            ans += word1.charAt(i);
            ans += word2.charAt(j);
            i++;
            j++;
        }
        while(i < n1) {
            ans += word1.charAt(i);
            i++;
        }
        while(j < n2) {
            ans += word2.charAt(j);
            j++;
        }
        return ans;
    }
}