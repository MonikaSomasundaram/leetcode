class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char i:s.toCharArray()){
              hm.put(i,hm.getOrDefault(i,0)+1);
        }
        String a="";
        for(char i:order.toCharArray()){
            if(hm.containsKey(i)){
                for(int j=0;j<hm.get(i);j++)a+=i;
                hm.remove(i);
            }
        }
        for(char i:hm.keySet()){
            for(int j=0;j<hm.get(i);j++)a+=i;
        }
        return a;
    }
}