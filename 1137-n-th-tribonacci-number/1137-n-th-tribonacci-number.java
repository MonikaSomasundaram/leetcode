class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        if(n==0)
          return 0;
        else if(n==1 || n==2)
          return 1;
        else{
          int d=0;
          while(n>=3){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            n--;
          }
          return d;
        }

    }
}