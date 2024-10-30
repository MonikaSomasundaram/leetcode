class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char i:magazine.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(char i:ransomNote.toCharArray()){
            if(!hm.containsKey(i)) return false;
            else{
                if(hm.get(i)==0)return false;
                else{
                    hm.put(i,hm.get(i)-1);
                }
            }
        }
        return true;
    }
}