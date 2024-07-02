class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;//since postives are in even place
        int neg=1;//odd place so 1
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }
            else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        // for(int i=0;i<ans.length;i++){
        //     nums[i]=ans[i];
        // }
        return ans;
    }
}