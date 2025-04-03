class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> arr=new TreeMap<>();
        for(int[] i:nums1)
        {
            arr.put(i[0],i[1]);
        }
        for(int[] num:nums2)
        {
            arr.put(num[0],arr.getOrDefault(num[0],0)+num[1]);
        }
        List<int[]> mg=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:arr.entrySet())
        {
            mg.add(new int[]{e.getKey(),e.getValue()});
        }
        int[][] res=new int[mg.size()][2];
        for(int i=0;i<mg.size();i++)
        {
            res[i]=mg.get(i);
        }
        return res;
    }
}