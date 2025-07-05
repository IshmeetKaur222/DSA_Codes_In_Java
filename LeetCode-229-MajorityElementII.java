class Solution {
    public List<Integer> majorityElement(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    //List since more than one element can be appearing n/3 times
    List<Integer> result = new ArrayList<>();
    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(int num:map.keySet()){
        if(map.get(num)>nums.length/3){
            result.add(num);
        }
    }
    return result;
  
    }
}