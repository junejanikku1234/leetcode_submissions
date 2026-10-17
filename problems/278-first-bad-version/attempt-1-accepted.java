public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;      // first bad is at mid or before
            } else {
                left = mid + 1;   // first bad is after mid
            }
        }
        return left;
    }
}
