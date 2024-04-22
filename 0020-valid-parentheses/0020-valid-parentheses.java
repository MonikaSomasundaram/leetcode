class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack=new Stack<>();
     HashMap<Character,Character> hm=new HashMap<>();
     hm.put('{','}');
     hm.put('(',')');
     hm.put('[',']');
     int f=1;
     for(char i :s.toCharArray()){
         if(hm.containsKey(i)){
             stack.push(i);
         }
         else{
             if(stack.empty()){
                 f=0;
                 break;
             }
             else{
                 char prev=stack.pop();
                 if(hm.get(prev)!=i){
                     f=0;
                     break;
                 }
             }
         }
     }
     if(f==1 && stack.empty()){
        return true;
     }
     else{
          return false;
     }
    }
}