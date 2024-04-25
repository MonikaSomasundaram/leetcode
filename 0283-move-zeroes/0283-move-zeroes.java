class Solution {
    public void moveZeroes(int[] nums) {
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[p];
                nums[p]=temp;
                p++;
            }
        }
        while(p<nums.length){
            nums[p]=0;
            p++;
        }
    }
}