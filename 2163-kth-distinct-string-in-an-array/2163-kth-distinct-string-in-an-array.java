class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(String i:arr){
          hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int c=1;
        for(String i:arr){
            if(hm.get(i)==1){
               if(c==k) return i;
               c++;
            }
        }
        return "";
    }
}