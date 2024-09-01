class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int c=0;
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            int min_col=-1;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    min_col=j;
                }
            }
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(matrix[j][min_col]>max)max=matrix[j][min_col];
            }
            if(min==max)ans.add(min);
        }
        return ans;
    }
}