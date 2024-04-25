class Solution {
    public void moveZeroes(int[] nums) {
        int z=0,nz=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
               nz++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            }
        }
       // return nums;
    }
}