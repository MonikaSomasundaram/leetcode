class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c=nums.length/3;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>c){
                ans.add(i);
            }
        }
        return ans;

    }
}