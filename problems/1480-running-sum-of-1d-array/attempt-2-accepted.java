import java.util.ArrayList;

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        int[] runSum = new int[nums.length];
        runSum[0] = sum;
        for(int i=1; i < nums.length; i++){
            sum += nums[i];
            runSum[i] = sum;
        }
        return runSum;
    }
}