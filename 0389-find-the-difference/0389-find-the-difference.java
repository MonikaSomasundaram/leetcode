class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
           hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1 );
        }
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
        }
    
       Set set=hm.entrySet();
       Iterator i=set.iterator();
       while(i.hasNext()){
           Map.Entry m=(Map.Entry)i.next();
           if((int)m.getValue()!=0)
            {
               return (char)m.getKey();
            }
       }
        return '\0';
    }
   
}