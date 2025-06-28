
class Solution {
    public static void zigZag(int[] arr) {
        boolean flag = true;
        if(flag){
            for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp =  arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                if(!flag){
                    if(arr[i]<arr[i+1]){
                    int temp =  arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    }
                }
                flag = !flag;
            }
        }
        