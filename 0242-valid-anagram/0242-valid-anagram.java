class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
         HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char x=t.charAt(i);
            
            hm1.put(x,hm1.getOrDefault(x,0)+1);
        }
        if(hm.equals(hm1)){
            return true;
        }
        else{
            return false;
        }
        
    }
}