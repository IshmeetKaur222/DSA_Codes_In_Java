class Solution {
    public int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int currSum = nums[0];
    for(int i = 1; i<nums.length;i++){
        
            currSum= currSum+nums[i];
            currSum= Math.max(currSum,nums[i]);//check  if current number of array is greater than current sum
            maxSum=Math.max(currSum,maxSum);//check out of current sum or previous maxSum which is bigger
        
        

    } 
    return maxSum;
    }
}