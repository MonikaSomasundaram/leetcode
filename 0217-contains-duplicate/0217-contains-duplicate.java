class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
      }
      System.out.println(hs);
        if(hs.size()<nums.length){
             return true;
        }
        return false;
    }
}