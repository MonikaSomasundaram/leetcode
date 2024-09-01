class Solution {
    public int findComplement(int num) {
        int s=0;
        int i=0;
        while(num>0){
            int r=num%2;
            if(r==0)s+=Math.pow(2,i);
            num/=2;
            i++;
        }
        return s;
    }
}