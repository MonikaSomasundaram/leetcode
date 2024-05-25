class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedList<List<Integer>> ans=new LinkedList<>();
        Arrays.sort(nums);
        int f,l;
        int s;
        for(int i=0;i<nums.length-2;i++){
            f=i+1;
            l=nums.length-1;
            while(f<l){
                s=nums[f]+nums[l];
                if(s<(-1*nums[i])){
                    f++;
                }
                else if(s>(-1*nums[i])){
                     l--;
                }
                else{
                     ans.add(Arrays.asList(nums[i],nums[f],nums[l]));
                     while(f<l && nums[f]==nums[f+1]){
                        f++;
                     }
                     while(f<l && nums[l]==nums[l-1]){
                        l--;
                     }
                    f++;
                    l--;
                }
            }
            while(i<nums.length-2 && nums[i]==nums[i+1]) i++;
        }
        return ans;
    }
}