class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray()) {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a,b)->freq.get(b) - freq.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c: chars) {
            int count = freq.get(c);
            sb.append(String.valueOf(c).repeat(count));
        }
        return sb.toString();
    }
}