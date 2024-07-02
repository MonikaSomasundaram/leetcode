class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        s=s.toLowerCase();
        for(char i:s.toCharArray()){
            if((i>='a' && i<='z') || (i>='0' && i<='9')){
                ans+=i;
            }
        }
        int l=0;
        int r=ans.length()-1;
        while(l<r){
            if(ans.charAt(l)==ans.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}