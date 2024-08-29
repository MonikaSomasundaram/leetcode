class Solution {
    public String longestPalindrome(String s) {
        int arr[][]=new int[s.length()][s.length()];
        int max=-1,start=-1,end=-1;
        for(int k=0;k<s.length();k++){
            for(int i=0,j=i+k;i<s.length()&&j<s.length();i++,j++){
                if(i==j) arr[i][j]=1;
                else if(j-i==1){
                    if(s.charAt(i)==s.charAt(j)) arr[i][j]=2;
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && arr[i+1][j-1]!=0){
                        arr[i][j]=arr[i+1][j-1]+2;
                    }
                }
                if(arr[i][j]!=0 && j-i+1>max){
                       max=j-i+1;
                       start=i;
                       end=j;
                    } 
            }
           
        }
        return s.substring(start,end+1);
    }
}