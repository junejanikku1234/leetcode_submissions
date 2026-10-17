class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concatArr = new int[2 * nums.length];
        System.arraycopy(nums,0,concatArr,0,nums.length);
        System.arraycopy(nums,0,concatArr,nums.length,nums.length);
        return concatArr;
    }
}