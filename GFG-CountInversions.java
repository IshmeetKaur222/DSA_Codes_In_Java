class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr,0,arr.length-1);
    }
    static int mergeSort(int arr[],int left, int right){
        int count =0;
        if(left<right){
            int  mid=(left+right)/2;
            count+=mergeSort(arr,left,mid);
            count+=mergeSort(arr,mid+1,right);
            count+=merge(arr,left,mid,right);
        }
        return count;
    }
    static int merge(int arr[],int left,int mid,int right){
        int temp[] = new int[right-left+1];
        int i=left,j=mid+1,k=0;
        int count=0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
                count+=(mid-i+1);
            }
        }
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=right) temp[k++]=arr[j++];
        for(int y=0;y<temp.length;y++){
            arr[left+y]=temp[y];
        }
        return count;
    }
}