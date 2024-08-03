class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        double max=nums[0];
        for(int i=0;i<n;i++){
            double pro=1;
            for(int j=i;j<n;j++){
                pro*=nums[j];
                if(pro>max)max=pro;
            }
        }
        return (int)max;
    }
}