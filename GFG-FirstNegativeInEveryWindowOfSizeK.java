class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> result = new ArrayList<>();
        Queue<Integer> storeIndex = new LinkedList<>();
        for(int  i  =0; i<arr.length;i++){
            if(arr[i]<0){
                storeIndex.add(i);
            }
            while(!storeIndex.isEmpty()&&storeIndex.peek()<i-k+1){
                storeIndex.poll();
            }
            if(i>=k-1){
                if(!storeIndex.isEmpty()){
                    result.add(arr[storeIndex.peek()]);
                }
                else{
                    result.add(0);
                }
            }
        }
        return result;
    }
}