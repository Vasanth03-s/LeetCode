class Solution {
    public int maxArea(int[] height) {
        int h=0;
        int i=0,j=height.length-1;
        int area=0,base=0;
        int maxarea=0;
        while(i<j)
        {
            base=j-i;
            h=Math.min(height[i],height[j]);
            area=base*h;
            maxarea=Math.max(maxarea,area);
            if(height[i]<height[j])
            {
                i++;
            }
            else {
                j--;
            }
        }
        return maxarea;
        
    }
}