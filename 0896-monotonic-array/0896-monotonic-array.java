class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;
        
        for(int i=0;i<nums.length-1;i++){
            //increasing
            if(nums[i]>nums[i+1]){
                inc=false;
            }
              //decreasing
             if(nums[i]<nums[i+1]){
                dec=false;
            }
        }
      

        return inc||dec;
    }
}