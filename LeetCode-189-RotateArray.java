class Solution {
    public void rotate(int[] nums, int k) {
        //rotated array for result
        int rotatedArr[] = new int[nums.length];
        //for loop in nums,to get each value's new index in rotated array
        for (int i = 0; i < nums.length; i++) {
            rotatedArr[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotatedArr[i];
        }
    }
}
