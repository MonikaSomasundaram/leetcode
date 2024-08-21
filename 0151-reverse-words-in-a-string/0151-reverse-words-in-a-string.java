class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        String a="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)==' ') && (i-1>=0) && (s.charAt(i-1)==' ')){

            }
            else{
                a+=s.charAt(i);
            }
        }
        String arr[]=a.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
            ans+=arr[i].trim()+" ";
        }
        return ans.trim();
    }
}