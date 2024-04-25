class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0;
        int s2=0;
        for(int i=0;i<s.length();i++){
            s1+=s.charAt(i)-'a';
        }
        for(int i=0;i<t.length();i++){
            s2+=t.charAt(i)-'a';
        }
        int ans=Math.abs(s1-s2)+'a';
        return (char)ans;
    }
}