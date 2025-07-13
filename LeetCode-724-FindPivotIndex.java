class Solution {
    public int pivotIndex(int[] nums) {
    int totalSum=0;
    for(int k : nums){
        totalSum+=k;
    }
    int leftSum=0;
    int rightSum=0;
    for(int k=0;k<nums.length;k++){
    rightSum=totalSum-leftSum-nums[k];
    
    if(leftSum==rightSum){
        return k;
    }

    leftSum+=nums[k];
    }
    return -1;
}
} 