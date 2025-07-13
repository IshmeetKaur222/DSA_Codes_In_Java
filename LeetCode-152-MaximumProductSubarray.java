class Solution {
    public int maxProduct(int[] nums) {
    int maxSoFar = Integer.MIN_VALUE;
    int maxProd = 1, minProd = 1;

for (int num : nums) {
    if (num == 0) {
        maxSoFar = Math.max(maxSoFar, 0);
        maxProd = 1;
        minProd = 1;
    } else {
        int temp = maxProd;
        maxProd = Math.max(num, Math.max(maxProd * num, minProd * num));
        minProd = Math.min(num, Math.min(temp * num, minProd * num));
        maxSoFar = Math.max(maxSoFar, maxProd);
    }
}
   return maxSoFar;
    }
}