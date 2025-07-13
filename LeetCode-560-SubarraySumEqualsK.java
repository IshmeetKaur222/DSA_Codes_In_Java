class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int total  = 0;
    int sumSoFar=0;
    for(int num:nums){
        sumSoFar+=num;
//was there any previous sum that can be subtracted from sumSoFar so that I get k
    int prev = sumSoFar - k;
    if(map.containsKey(prev)){
        total+=map.get(prev);
    }
    map.put(sumSoFar,map.getOrDefault(sumSoFar,0)+1);
    }
    return total;
    }
}