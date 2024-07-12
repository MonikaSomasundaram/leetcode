class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        int presum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
         for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            if(hm.containsKey(presum-k)){
                c+=hm.get(presum-k);
            }
            hm.put(presum,hm.getOrDefault(presum,0)+1);
         }
        return c;
    }
}