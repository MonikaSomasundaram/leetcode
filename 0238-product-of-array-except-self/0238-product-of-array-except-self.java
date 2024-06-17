class Solution {
    public int[] productExceptSelf(int[] nums) {
        //int p=1;
        int arr[]=new int[nums.length];
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        pre[0]=1;
        suf[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=pre[i]*suf[i];
        }
        return arr;
    }
}