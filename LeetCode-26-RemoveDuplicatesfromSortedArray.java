class Solution {
    public int removeDuplicates(int[] nums) {
        int writer = 0;
        for(int reader=1; reader< nums.length;reader++){
            if(nums[writer]!=nums[reader]){
                writer++;
                nums[writer]= nums[reader];//current reader becomes writer  now 
            }
        }
        return writer+1; 
    }
} 