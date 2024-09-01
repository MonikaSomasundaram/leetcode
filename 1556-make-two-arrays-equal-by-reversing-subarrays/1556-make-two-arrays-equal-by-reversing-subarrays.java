class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
          hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:target){
            if(!hm.containsKey(i))return false;
            else{
                hm.put(i,hm.get(i)-1);
            }
        }
        for(int i:hm.keySet()){
            if(hm.get(i)!=0) return false;
        }
        return true;
    }
}