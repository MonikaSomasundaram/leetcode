class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)return nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        int i;
        for( i=0;i<nums.length;i++){
            if(i-1!=-1 && nums[i]!=nums[i-1]){
                if(hm.get(nums[i-1])==1){
                    nums[c]=nums[i-1];
                    c++;
                }
                else{
                    nums[c]=nums[i-1];
                    nums[c+1]=nums[i-1];
                    c+=2;
                }
            }
        }
        if(c==0||nums[c-1]!=nums[i-1]){
            if(hm.get(nums[i-1])==1){
                    nums[c]=nums[i-1];
                    c++;
                }
                else{
                    nums[c]=nums[i-1];
                    nums[c+1]=nums[i-1];
                    c+=2;
                }
        }
        return c;
    }
}