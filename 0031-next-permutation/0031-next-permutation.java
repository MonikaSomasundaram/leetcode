class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                ind=i-1;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }//no decrease that is it is the last combination we need to return the first combination so we just reverse it.
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }
    public void reverse(int nums[],int f,int l){
        while(f<=l){
            int temp=nums[f];
            nums[f]=nums[l];
            nums[l]=temp;
            f++;
            l--;
        }
    }
}