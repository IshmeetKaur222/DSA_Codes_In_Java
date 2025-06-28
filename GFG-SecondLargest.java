class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first_largest=-1;
        int second_largest= -1;
        for(int i:arr){
            if(i>first_largest){
                second_largest=first_largest;
                first_largest=i;
            }
            else if(i>second_largest && i!=first_largest){
               second_largest=i; 
            }
        }
        return second_largest;
    }
}