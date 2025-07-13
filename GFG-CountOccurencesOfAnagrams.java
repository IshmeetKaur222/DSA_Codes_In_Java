// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: pat.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0;
        int right=0;
        int  ans=0;
        int count =  map.size();
        int k = pat.length();
        while(right<txt.length()){
            char ch = txt.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)-1);//one instance used if match found 
            }
            if(map.containsKey(ch)&&map.get(ch)==0){
                count--;
                //means one character successfully whole matched and
                //one less character out of all characters left to match
            }
        
        if(right-left+1<k){
            right++;
        }
        else if(right-left+1==k){
            if(count==0){
                ans++;
            }
        
        char leftChar = txt.charAt(left);
        if(map.containsKey(leftChar)){
            if(map.get(leftChar)==0){
                count++;
            }
            map.put(leftChar,map.get(leftChar)+1);
        }
        left++;
        right++;
        }//else if lock
        }
        return ans;
    }
}
