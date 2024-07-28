class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int arr[]=new int[s.length];
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                c++;
                j++;
                i++;
            }
            else{
                j++;
            }
        }
        return c;
    }
}