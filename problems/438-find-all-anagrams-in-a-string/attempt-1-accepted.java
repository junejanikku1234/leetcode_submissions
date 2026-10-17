class Solution {
    public static List<Integer> findAnagrams(String s, String p) {
    
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        // frequency of p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int left = 0, right = 0;
        int k = p.length();

        while (right < s.length()) {
            // add right char
            window[s.charAt(right) - 'a']++;
            right++;

            // shrink window if size > k
            if (right - left > k) {
                window[s.charAt(left) - 'a']--;
                left++;
            }

            // compare when window size == k
            if (right - left == k && Arrays.equals(window, pCount)) {
                result.add(left);
            }
        }

        return result;
    }
}