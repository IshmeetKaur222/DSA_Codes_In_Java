class Solution {
    public int numIdenticalPairs(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int resultCount=0;
//Only values are being counted and since we dont require index, enhanced for loop is appropriate

for(int i : nums){
    //add previous count of number of existing pairs to resultCount
    int prevCount = map.getOrDefault(i,0);//previous count
    resultCount+= prevCount;
    //Then increment the count 
   map.put(i,prevCount+1);//Update count
   
}
return resultCount;
    }
}