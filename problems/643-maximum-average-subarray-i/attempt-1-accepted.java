class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        
        // First window
        for(int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        
        double maxSum = currSum;
        
        // Slide the window
        for(int i = k; i < nums.length; i++) {
            currSum = currSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum / k;
    }
}