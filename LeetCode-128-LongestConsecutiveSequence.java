class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longestStreak = 0;
        for (int val : set) {
            if (!set.contains(val - 1)) {
                //if number -1 i.e previous number not in set then the currentnumber is the start of sequence
                int currval = val;
                int currStreak = 1;
                while (set.contains(currval + 1)) {
                    currval = currval + 1;
                    currStreak = currStreak + 1;
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }

        }
        return longestStreak;
    }
}