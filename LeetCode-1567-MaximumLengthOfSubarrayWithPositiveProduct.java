class Solution {
    public int getMaxLen(int[] nums) {
    int  maxLen=0;
    int start=0;
    int negCount=0;
    int firstNeg=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            start=i+1;
            firstNeg=-1;
            negCount=0;
        }
        else{
            if(nums[i]<0){
                negCount++;
            if (negCount % 2 == 1 && firstNeg == -1) 
            {
            firstNeg = i;
}


            }
            if(negCount%2==0){
                maxLen=Math.max(maxLen,i-start+1);
            }
            else{
                 maxLen=Math.max(maxLen,i-firstNeg);
            }
        }
    }
    return maxLen;
    }
}
