class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int absNum = Math.abs(x);
        while(absNum != 0) {
            reversed = reversed * 10 + (absNum%10);
            absNum = absNum/10;
        }
        if ((reversed > Integer.MAX_VALUE) || (reversed < Integer.MIN_VALUE)) {
            return 0;
        }
        if (x<0) return -1 * reversed;
        return reversed;

    }
}