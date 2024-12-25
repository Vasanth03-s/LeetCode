class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {        
        int j=0;
       if (nums1.length == 1) {
            nums1[0] += (n > 0) ? nums2[0] : 0;
            return;
        }
        for(int i=m;i<nums1.length;i++)
        {
            nums1[i]+=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        
        
    }
}