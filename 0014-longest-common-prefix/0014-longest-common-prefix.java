class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        int n=a.length();
        int i=0;
        String ans="";
        while(i<n && a.charAt(i)==b.charAt(i)){
            ans+=a.charAt(i);
            i++;
        }
        return ans;
    }
}