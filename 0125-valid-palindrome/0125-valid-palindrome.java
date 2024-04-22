class Solution {
    public boolean isPalindrome(String s) {
        int f=0;
        int l=s.length()-1;
        String t="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        while(f<l){
            if(t.indexOf(s.charAt(f))==-1 && t.indexOf(s.charAt(l))==-1){
                f++;
                l--;
            }
            else if(t.indexOf(s.charAt(f))==-1){
                f++;
            }
            else if(t.indexOf(s.charAt(l))==-1){
                l--;
            }
            else if((String.valueOf(s.charAt(f)).toLowerCase()).equals(String.valueOf(s.charAt(l)).toLowerCase())){
                f++;
                l--;
            }
            else{
                // System.out.println(s.charAt(f)+" "+s.charAt(l)+" "+String.valueOf(s.charAt(f)).toLowerCase()+" "+String.valueOf(s.charAt(l)).toLowerCase());
                return false;
            }
        }
        return true;
    }
}