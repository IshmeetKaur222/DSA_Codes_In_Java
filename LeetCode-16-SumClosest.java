class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int curr_sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(curr_sum - target) < Math.abs(closest_sum - target)) {
                    closest_sum = curr_sum;//new closest will be curr now
                }
                if (curr_sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closest_sum;
    }
}