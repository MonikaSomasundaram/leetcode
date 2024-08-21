class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> st=new Stack<>();//pushing index of bracket
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else{
                int k=st.pop();
                if(st.isEmpty()){
                    ans+=s.substring(k+1,i);
                }
            }
        }
        return ans;
    }
}