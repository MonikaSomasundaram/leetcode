class Solution {
    public String firstPalindrome(String[] words) {
        for(String i:words){
            if(ispalindrome(i)){
                return i;
            }
        }
        return "";
    }
    public static boolean ispalindrome(String str){
        int f=0,l=str.length()-1;
        while(f<l){
            if(str.charAt(f)!=str.charAt(l)){
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
    
}