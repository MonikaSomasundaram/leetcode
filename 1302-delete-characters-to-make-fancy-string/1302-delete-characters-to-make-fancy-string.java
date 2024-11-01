class Solution {
    public String makeFancyString(String s) {
        //String ans=""+s.charAt(0);
        StringBuffer ans=new StringBuffer();
        ans.append(s.charAt(0));
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
                if(c<=2)
                  ans.append(s.charAt(i));
            }
            else{
                c=1;
                ans.append(s.charAt(i));
            }
        }
        return String.valueOf(ans);
    }
}