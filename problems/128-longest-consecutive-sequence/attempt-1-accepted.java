class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashSet<Integer> hSet = new HashSet<>();
        for (int i : nums) {
            hSet.add(i);
        }

        int longestStreak = 0;

        for (int num : hSet) {
            if (!hSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (hSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}