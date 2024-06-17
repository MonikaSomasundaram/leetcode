class Solution {
    public boolean judgeSquareSum(int c) {
     long f=0;
     long  l=(long)Math.sqrt(c);
     while(f<=l){
        long  t=f*f+l*l;
        if(t==c){
            return true;
        }
        else if(t>c){
            l--;
        }
        else{
            f++;
        }

     }
     return false;
    }
}