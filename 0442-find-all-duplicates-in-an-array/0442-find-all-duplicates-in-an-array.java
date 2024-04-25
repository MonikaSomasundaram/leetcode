import java.io.*;
import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                 arr.add(Math.abs(nums[i]));
            }
            else{
              nums[Math.abs(nums[i])-1]*=-1;
            }
        }
        return arr;
    }
}