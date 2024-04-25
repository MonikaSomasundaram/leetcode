class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=nums[0];
        for(int i:nums){
            if(i>max)
              max=i;
        }
        long left=0;
        long count=0;
        long ans=0;
        for(long right=0;right<nums.length;right++){
            if(max==nums[(int)right]){
                count++;
            }
            while(count>=k){
               if(nums[(int)left]==max){
                count--;
               }
               left++;
               ans+=nums.length-right;
               
            }
        }
        return ans;
    }
}