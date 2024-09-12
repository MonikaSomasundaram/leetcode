class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String i:words){
            int f=0;
            for(char j:i.toCharArray()){
                if(!allowed.contains(String.valueOf(j))){
                    f=1;
                    break;
                }
            }
            if(f==0) c++;
        }
        return c;
    }
}