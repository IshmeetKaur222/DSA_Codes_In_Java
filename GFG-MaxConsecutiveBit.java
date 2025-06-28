class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int maxCount = 0;
        int currentCount = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
            //checking if next and previous element of array is same
            currentCount++;
            }
            else{
                maxCount = Math.max(maxCount, currentCount);
                currentCount=1;//reset
            }
        }
        maxCount = Math.max(maxCount, currentCount);
        return maxCount;
    }
}
