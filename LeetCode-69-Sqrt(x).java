class Solution {
    public int mySqrt(int x) {
        // int result =(int)Math.sqrt(x);
        // return result;
        int low = 0;
        int high = x;
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long mid_square = (long) mid * mid;
            if (mid_square == x) {
                return mid;
            } else if (mid_square > x) {
                //go left
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return high;
    }
}