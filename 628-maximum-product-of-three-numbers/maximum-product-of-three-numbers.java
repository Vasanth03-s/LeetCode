class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // Ensure array is sorted
        int n = nums.length;

        // Compute the three potential maximum products
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];
        int product3 = nums[0] * nums[n - 2] * nums[n - 1];

        // Return the maximum of the three
        return Math.max(product1, Math.max(product2, product3));
    }
}
