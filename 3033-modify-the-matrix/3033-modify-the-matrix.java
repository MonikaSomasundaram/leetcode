class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int arr[]=new int[n];
        int[][] modifiedMatrix=new int[m][n];
        int max=-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            arr[i]=max;
            max=-2;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    modifiedMatrix[i][j]=arr[j];
                }
                else{
                    modifiedMatrix[i][j]=matrix[i][j];
                }
            }
        }
        return modifiedMatrix;
    }
}