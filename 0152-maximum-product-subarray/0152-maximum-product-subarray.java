class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        double pre=1;
        double suff=1;
        double max=nums[0];
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suff==0)suff=1;
            pre*=nums[i];
            suff*=nums[n-1-i];
            max=Math.max(max,Math.max(pre,suff));
        }
        return (int)max;
    }
}