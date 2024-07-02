class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        s=s.toLowerCase();
        for(int j=0;j<s.length();j++){
            char i=s.charAt(j);
            if((i>=97 && i<=122) || (i>=48 && i<=57)){
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