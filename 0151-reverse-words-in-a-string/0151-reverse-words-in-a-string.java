class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        String arr[]=s.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
            ans+=arr[i].trim()+" ";
        }
        return ans.trim();
    }
}