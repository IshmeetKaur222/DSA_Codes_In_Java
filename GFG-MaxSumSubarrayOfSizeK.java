// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int currSum=0;
        for(int i=0;i<k;i++){
            currSum+=arr[i];
        }
        int maxSum=currSum;
        for(int i=k;i<arr.length;i++){
            currSum= currSum-arr[i-k]+arr[i];
            maxSum= Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}