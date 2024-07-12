class Solution {
    public void setZeroes(int[][] matrix) {
        //brute force
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    //set row as -1;
                    for(int k=0;k<n;k++){
                        if(matrix[i][k]!=0){
                            matrix[i][k]=-11111;
                        }
                    }
                    //set column as 0
                    for(int k=0;k<m;k++){
                        if(matrix[k][j]!=0){
                            matrix[k][j]=-11111;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-11111){
                    matrix[i][j]=0;
                }
            }
        }
    }
}