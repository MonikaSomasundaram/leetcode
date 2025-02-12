class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int c=0;
        int pos=-1;
        int neg=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
              pos=i;
              neg=i-1;
              break;
            }
        }
        if(pos==-1){
            neg=nums.length-1;
            pos=nums.length;
        }
        while(pos<nums.length && neg>=0){
            if(nums[pos]<=Math.abs(nums[neg])){
                arr[c]=nums[pos]*nums[pos];
                pos++;
            }
            else{
                arr[c]=nums[neg]*nums[neg];
                neg--;
            }
            c++;
        }
        while(neg>=0){
            arr[c]=nums[neg]*nums[neg];
            neg--;
            c++;
        }
        while(pos<nums.length){
            arr[c]=nums[pos]*nums[pos];
            pos++;
            c++;
        }
        return arr;
    }
}