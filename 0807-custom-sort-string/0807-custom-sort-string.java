class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
              hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        String a="";
        for(int i=0;i<order.length();i++){
            if(hm.containsKey(order.charAt(i))){
                for(int j=0;j<hm.get(order.charAt(i));j++)a+=order.charAt(i);
                hm.remove(order.charAt(i));
            }
        }
        for(char i:hm.keySet()){
            for(int j=0;j<hm.get(i);j++)a+=i;
        }
        return a;
    }
}