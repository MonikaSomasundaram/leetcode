class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int s;
        for(int i=0;i<accounts.length;i++){
            s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
            if(s>max)max=s;
        }
        return max;
    }
}