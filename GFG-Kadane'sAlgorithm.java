class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum=arr[0];
        int currSum=arr[0];
        for(int i=1;i<arr.length;i++){
        currSum=Math.max(arr[i],currSum+arr[i]);
        maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    
}

