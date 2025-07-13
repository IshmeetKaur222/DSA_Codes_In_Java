class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //Step 1: Compute current window of k size's sum as current sum
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum = currSum + nums[i];
        }
        int maxSum = currSum;//before updation maxSummust have been some current sum of  previous iteration
        //after traversing a window  of k size, we are at i=k th position
        //value just before k will be removed and after k window will be added
        for (int i = k; i < nums.length; i++) {
            //compute current sum again
            currSum = currSum - nums[i - k] + nums[i];
            //current sum  = current sumprevious window - current  index i=k, 1  element just before k  elements will be subtracted and one just  after will be added
            //maximum  sum calculation by comparing current sum of new window and previous current i.e. maxsum
            maxSum = Math.max(currSum, maxSum);
        }
        //Calculating average
        double maxAvg = (double) maxSum / k;
        return maxAvg;
    }
}