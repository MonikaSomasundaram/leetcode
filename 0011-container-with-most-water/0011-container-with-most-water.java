class Solution {
    public int maxArea(int[] height) {
        int f=0;
        int l=height.length-1;
        int max=0;
        int wat;
        while(f<l){
            wat=Math.min(height[f],height[l])*(l-f);
            if(wat>max) max=wat;
            if(height[f]>height[l]) l--;
            else f++;
        }
        return max;
    }
}