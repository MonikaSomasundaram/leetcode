class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> s=new HashSet<>();
        for(int i:hm.keySet()){
            if(s.contains(hm.get(i))){
                return false;
            }
            else{
                s.add(hm.get(i));
            }
        }
        return true;
    }
}