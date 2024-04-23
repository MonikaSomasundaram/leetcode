class Solution {
    public int[] plusOne(int[] digits) {
       int l=digits.length-1;
       int num=digits[l];
       if(num!=9){
        digits[l]=digits[l]+1;
        return digits;
       }
       else{
        while(l>-1 && digits[l]==9){
            digits[l]=0;
            l--;
        }
        if(l!=-1){
         digits[l]=digits[l]+1;
         return digits;
        }
        else{
            int arr[]=new int[digits.length+1];
            arr[l+1]=1;
            return arr;
        }
       }
    }
}