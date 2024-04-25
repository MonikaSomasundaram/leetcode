class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int p1=0,p2=0;
        String s="";
        while(p1<word1.length()&&p2<word2.length()){
           if(p1<word1.length()&&p2<word2.length()){
               s+=String.valueOf(word1.charAt(p1));
               s+=String.valueOf(word2.charAt(p2));
               p1++;
               p2++;
           }
           if(p1<word1.length()&&p2==word2.length()){
               s+=word1.substring(p1);
           }
           if(p2<word2.length()&&p1==word1.length()){
               s+=word2.substring(p2);
           }
      
        }
        return s;
    }
    
}