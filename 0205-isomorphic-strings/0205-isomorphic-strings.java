class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char c1=t.charAt(i);
            if(!hm.containsKey(c)){
                if(hm.containsValue(c1)) return false;
                hm.put(c,c1);
            }
            else{
                if(hm.get(c)!=c1) return false;
            }  
        }
        return true;
    }
}