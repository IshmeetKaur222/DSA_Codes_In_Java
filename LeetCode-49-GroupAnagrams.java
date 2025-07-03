class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] arr = word.toCharArray();//store and converted string word to character array
            Arrays.sort(arr);
            //convert character array back to sorted string
            String key = new String(arr);
            //key  is now sored in string word2
            //now checking  if key is present ,if not then add that
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}