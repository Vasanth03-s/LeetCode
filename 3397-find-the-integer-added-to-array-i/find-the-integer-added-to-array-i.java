class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int diff=nums2[0]-nums1[0];
        return diff;
        
    }
}