class Solution {
    public boolean checkValidString(String s) {
        int min=0;
        int max=0;//for keeping range of min and max, since if *,3 possible ways-1)'('->count++,2)')'->count--,3)'*'->c--close or c itself empty or c++ open
        for(char i:s.toCharArray()){
            if(i=='('){
                min++;
                max++;
            }
            else if(i==')'){
                min--;
                max--;
            }
            else{//'*'
                min--;//can be ')'
                max++;//can be '(' 
            }
            if(min<0)min=0;//np,since even if it goes under 0 we need not consider, only the max possibility should not be less than 0.we are making min as 0 hoping max will be greater than 0.
            if(max<0)return false;//no possibility
        }
        return min==0;
    }
}
// basic logic->if open c++,close c--.if c goes below 0,then more closing so return false.at last finally c should be zero if not so then more opening.