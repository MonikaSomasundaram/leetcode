class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        while(top<=bottom && left<=right){
            //left to right
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;

            //right to left
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                arr.add(matrix[bottom][i]);
            }
            }
            bottom--;
            //top to bottom
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                arr.add(matrix[i][left]);
            }
            }
            left++;
        }
        return arr;
    }
}