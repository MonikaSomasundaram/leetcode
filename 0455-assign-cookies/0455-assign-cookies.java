class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int arr[]=new int[s.length];
        int c=0;
        Arrays.sort(s);
        for(int i=0;i<g.length;i++){
             for(int j=0;j<s.length;j++){
                if(arr[j]==0 && s[j]>=g[i]){
                      arr[j]=1;
                      c++;
                      break;
                }
             }
        }
        return c;
    }
}