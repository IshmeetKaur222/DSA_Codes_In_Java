class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result= new ArrayList<>();
    Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    for(int i[]:intervals){
    if(result.size()==0||result.get(result.size()-1)[1]<i[0]){
        result.add(i);
    }
    else{
    result.get(result.size()-1)[1]= Math.max(result.get(result.size()-1)[1],i[1]);
    }
    }   
    return result.toArray(new int[result.size()][]);
    }
}