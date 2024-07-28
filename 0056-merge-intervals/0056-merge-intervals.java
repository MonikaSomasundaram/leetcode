class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(Arrays.asList(start,end));
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(Arrays.asList(start,end));
        int rows = ans.size();
        int cols = 2; 
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = ans.get(i).get(j);
            }
        }
        return array;
    }
}