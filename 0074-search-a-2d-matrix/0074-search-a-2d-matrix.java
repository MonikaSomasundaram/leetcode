class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row=-1;
        for(int i=0;i<m;i++){
            if(target==matrix[i][0]) return true;
            if(target<matrix[i][0] && i-1>=0){
                row=i-1;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(target==matrix[0][i] || target==matrix[m-1][i]) return true;
        }
        if(row>=0){
        for(int i=0;i<n;i++){
            if(target==matrix[row][i]) return true;
        }
        }
        return false;
    }
}