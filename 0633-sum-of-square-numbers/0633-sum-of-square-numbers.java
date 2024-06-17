class Solution {
    public boolean judgeSquareSum(int c) {
     long f=0;
     long  l=(long)Math.sqrt(c);
     while(f<=l){
        long  t=f*f+l*l;
        long  t1=f*f+f*f;
        long  t2=l*l+l*l;
        if(t==c || t1==c || t2==c){
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