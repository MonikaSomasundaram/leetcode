class Solution {
    public int trap(int[] height) {
        int pre[]=new int[height.length];
        int suf[]=new int[height.length];
        pre[0]=height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>pre[i-1])
                pre[i]=height[i];
            else
                pre[i]=pre[i-1];
        }
        suf[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            if(height[i]>suf[i+1])
                suf[i]=height[i];
            else
                suf[i]=suf[i+1];
        }
        int min;
        int ans=0;
        for(int i=0;i<height.length;i++){
           min=pre[i]<suf[i]?pre[i]:suf[i];
           ans+=min-height[i]; 
        }
        return ans;
    }
}