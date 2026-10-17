class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = sumOfArray(accounts[0]);
        for(int i=1; i < accounts.length; i++){
            if(sumOfArray(accounts[i]) > maxWealth){
                maxWealth = sumOfArray(accounts[i]);
            }
        }
        return maxWealth;
    }
    public int sumOfArray(int[] arr) {
        int sum = arr[0];
        for(int i=1; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}