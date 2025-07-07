class Solution {
    public int partitionDisjoint(int[] nums) {
    int leftMax=nums[0];
    int globalMax=nums[0];
    int left=0;
    for(int i= 1;i<nums.length;i++){
        if(nums[i]>=leftMax){
            globalMax=Math.max(globalMax,nums[i]);
        }
        else{
            left=i;
            leftMax=globalMax;
        }
    } 
    return left+1;   
    }
}