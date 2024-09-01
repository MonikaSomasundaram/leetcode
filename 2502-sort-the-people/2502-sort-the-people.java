class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=heights.length-1;i>=0;i--){
            names[heights.length-1-i]=hm.get(heights[i]);
        }
        return names;
    }
}