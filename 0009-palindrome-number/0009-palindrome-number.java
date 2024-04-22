class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }
        int num=0;
        int n=x;
        while(x>0){
            int r=x%10;
            num=num*10+r;
            x=x/10;
        }
        if(n==num){
            return true;
        }
        return false;
    }
}