class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        if(m != n) {
            return false;
        }
        
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        
        return Arrays.equals(sCharArray, tCharArray);
    }
}