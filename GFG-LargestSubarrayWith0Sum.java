import java.util.HashMap;

class Solution {
    int maxLength(int arr[]) {
        // HashMap to store (prefix sum, first index)
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
