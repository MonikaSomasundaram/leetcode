class Solution {
    public int firstMissingPositive(int[] nums) {
        //the 1st missing + num should be anyhow in the range of 1 to n, if it is fully filled without missing then the ans is n+1
        //1st lets omit that are in the range of <=0 and >n, mark them as n+1 or anything greater than that range
        //thus every num will be positive
        //if the num is not n+1,then mark that num's index as neg
        // then check from starting the loop, which is the 1st non neg num,thus the ans would be the that index
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 || nums[i]>nums.length){
                nums[i]=nums.length+1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<nums.length+1 && nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1]=-1*nums[Math.abs(nums[i])-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
       // System.out.println("IBguibrg");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return nums.length+1;

    }
}