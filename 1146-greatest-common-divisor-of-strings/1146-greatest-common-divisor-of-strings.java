class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1=str1.length();
        int l2=str2.length();
        int g=0;
        if((str1+str2).equals(str2+str1)){
            g=gcd(l1,l2);
            return str1.substring(0,g);
        }
        else{
            return "";
        }
    }
    public int gcd(int a,int b){
        int m;
        int n;
        int r;
        if(a>b){
            m=a;
            n=b;
        }
        else{
            m=b;
            n=a;
        }
        while(n>0){
            r=m%n;
            m=n;
            n=r;
        }
        return m;
    }
}