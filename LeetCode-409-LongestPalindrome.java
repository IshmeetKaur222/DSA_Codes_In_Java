import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                length += 2; // found a pair
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        // If there's at least one odd character, we can place one in the center
        if (!set.isEmpty()) {
            length += 1;
        }

        return length;
    }
}
