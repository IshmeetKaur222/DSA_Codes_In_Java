class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    for(int n1: nums1){
        map.put(n1,map.getOrDefault(n1,0)+1);
    }    
    for(int n2:nums2){
      if(map.containsKey(n2)&&map.get(n2)>0){
      result.add(n2);
      map.put(n2,map.get(n2)-1);
      }  
      }
    int count=0;
      int output[] = new int[result.size()];
      for(int i: result){
        output[count++] = i;
    }
    return output;
    }
}