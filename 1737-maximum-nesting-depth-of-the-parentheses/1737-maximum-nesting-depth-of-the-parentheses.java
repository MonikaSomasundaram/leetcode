class Solution {
    public int maxDepth(String s) {
        int o=0,max=0;
        for(char i:s.toCharArray()){
            if(i=='(') o++;
            else if(i==')'){
                if(o>max) max=o;
                o--;
            }
        }
        return max;
    }
}