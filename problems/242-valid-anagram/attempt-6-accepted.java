class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charCount = new int[26];
        for(char c: s.toCharArray()){
            charCount[c-'a']++;
        }
        for(char x: t.toCharArray()){
            if(charCount[x-'a'] == 0) return false;
            else{
                charCount[x-'a']--;
            }
        }
        return true;
    }
}