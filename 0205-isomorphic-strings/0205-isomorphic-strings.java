class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        HashMap<Character,Character> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char c1=t.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,c1);
            }
            else{
                if(hm.get(c)!=c1) return false;
            }  
            if(!hm1.containsKey(c1)){
                hm1.put(c1,c);
            }
            else{
                if(hm1.get(c1)!=c) return false;
            }  
        }
        return true;
    }
}