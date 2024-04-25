class Solution {
    public int arraySign(int[] nums) {
        int c1=0,c2=0;
        for(int i:nums){
            if(i==0){
                return 0;
            }
            else if(i<0){
                c1++;
            }
           
        }
        if(c1%2==0){
            return 1;
        }
        return -1;
    }
}