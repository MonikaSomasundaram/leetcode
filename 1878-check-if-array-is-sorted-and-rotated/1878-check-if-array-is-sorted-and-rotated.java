class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){

            }
            else{
                c++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            c++;
        }
        if(c<=1) return true;
        return false;

    }
}