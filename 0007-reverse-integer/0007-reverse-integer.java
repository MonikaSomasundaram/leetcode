class Solution {
    public int reverse(int x) {
        long x1=(long)x;
        if(x1<0){
           x1=Math.abs(x1);
        }
        long r;
        long ans=0;
        while(x1>0){
            r=x1%10;
            ans=ans*10+r;
            x1=x1/10;
        }
        
        if(ans>2147483647 || ans<-2147483648){
            return 0;
        }
        if(x<0){
            return -1*(int)ans;
        }
        return (int)ans;
    }
}