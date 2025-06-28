class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int n =arr.length;
        if(n<3){
            return -1;
        }
        for(int i = 0; i<n;i++){
            int num =arr[i];
            
        if(num>max1){
            max3=max2;
            max2=max1;
            max1=num;
        }
        else if(num>max2){
            max3=max2;
            max2=num;
        }
        else if(num>max3){
            max3=num;
        }//all ifs closed
        
        }
        if(max3==Integer.MIN_VALUE)//if max 3 not found so no change
        {
            return max1;//all same so return max1
        }
        //finally returning 3rd largest element
        return max3;
        
    }
    
}