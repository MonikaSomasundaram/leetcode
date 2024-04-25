class Solution {
    public boolean isMonotonic(int[] nums) {
        int p=0,inc=0,dec=0;
        while(p<nums.length-1){
            if(nums[p]<nums[p+1]){
                inc++;
            }
            else if(nums[p]>nums[p+1]){
                dec++;
            }
            else{
                inc++;
                dec++;
            }
            p++;
        }
        System.out.println(inc+" "+dec+" "+nums.length);
        if(inc==nums.length-1 || dec==nums.length-1){
            return true;
        }

        return false;
    }
}