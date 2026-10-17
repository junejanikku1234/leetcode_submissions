import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        else {
            char[] sCharArr = s.toCharArray();
            char[] tCharArr = t.toCharArray();

            Arrays.sort(sCharArr);
            Arrays.sort(tCharArr);
            
            return Arrays.equals(sCharArr, tCharArr);
        }
    }
}