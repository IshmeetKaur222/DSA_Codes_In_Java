class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();//to store nums1 elements
    for(int i: nums1){
        set.add(i);
    }
    Set<Integer> ans = new HashSet<>();//to store only  match orintersect elements common  in nums1 and nums2
    for(int j:nums2){
        if(set.contains(j)){
            ans.add(j);
        }
    }
    //since result is in array form we make an array
    //since ans list has the result,array of size same as ans list 
    int output[] = new int[ans.size()];
    int count = 0;
    for(int k:ans){//one by one picking each element from the result list made to array
    //adding each number 'k' of list to output array and increasing count or index
    output[count++]=k;
    }
    return output;//return output
    }
}