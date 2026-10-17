class Solution {
    public void moveZeroes(int[] nums) {
        int lastPointer =0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastPointer] = nums[i];
                lastPointer++;
            } 
        }
        for(int j=lastPointer; j<nums.length; j++){
            nums[j] = 0;
        }
    }
}