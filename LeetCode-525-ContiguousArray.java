import java.util.HashMap;

public class Solution {
    public int findMaxLength(int[] nums) {
        // HashMap to store first occurrence of cumulative count
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // base case: count 0 at index -1

        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0 to -1
            count += nums[i] == 1 ? 1 : -1;

            if (map.containsKey(count)) {
                // If same count has been seen before, subarray between them has equal 0s and 1s
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                // Store first occurrence of this count
                map.put(count, i);
            }
        }

        return maxLength;
    }
}
