class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        String b="";
        for(char i:s.toCharArray()){
            if(order.contains(String.valueOf(i)))
              hm.put(i,hm.getOrDefault(i,0)+1);
            else b+=i;
        }
        String a="";
        
        for(char i:order.toCharArray()){
            if(hm.containsKey(i)){
                for(int j=0;j<hm.get(i);j++)a+=i;
            }
        }
        
        return a+b;
    }
}