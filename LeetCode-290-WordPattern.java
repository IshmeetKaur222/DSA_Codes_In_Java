class Solution {
    public boolean wordPattern(String pattern, String s) {
        String strs[] = s.split(" ");
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        if (strs.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);//picking one element from pattern array
            String word = strs[i];//picking one element from string s
            if (map1.containsKey(ch))//if key present in map 1
            {
                if (!map1.get(ch).equals(word)) {
                    return false;
                }
            } else {
                map1.put(ch, word);//map.put(key,value)
            }
            if (map2.containsKey(word)) {
                if (!map2.get(word).equals(ch)) {
                    return false;
                }
            } else {
                map2.put(word, ch);
            }

        }
        return true;
    }
}
