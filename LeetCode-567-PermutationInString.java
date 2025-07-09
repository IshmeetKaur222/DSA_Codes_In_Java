class Solution {
    public boolean checkInclusion(String s1, String s2) {
    HashMap<Character,Integer> s1map =  new HashMap<>();
    HashMap<Character,Integer> win =new HashMap<>();
    for(char c:s1.toCharArray()){
        s1map.put(c,s1map.getOrDefault(c,0)+1);
    }    
    int k = s1.length();//window size
    for(int i=0; i<s2.length();i++){
        char c = s2.charAt(i);
        win.put(c,win.getOrDefault(c,0)+1);
        if(i>=k){
            char leftChar = s2.charAt(i-k);
            if(win.get(leftChar)==1){
                win.remove(leftChar);
            }
            else{
                win.put(leftChar,win.get(leftChar)-1);
            }
        }
        if(s1map.equals(win))
        {
            return true;
        }
        
    }
    return false;
    }
}