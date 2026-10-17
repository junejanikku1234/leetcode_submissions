class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = nums[0];
        
        for(int i = 1; i < k; i++) {
            currSum += nums[i];
        }
        
        double maxSum = currSum;
        
        for(int i = k; i < nums.length; i++) {
            currSum = currSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum / k;
    }
}