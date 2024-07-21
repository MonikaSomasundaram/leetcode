class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char arr[][]=new char[numRows][s.length()];
        int r=0;
        int c=0;
        int i=0;
        while(i<s.length()){
            while(i<s.length() && r<numRows){
                arr[r][c]=s.charAt(i);
                System.out.println(r+" "+c);;
                i++;
                r++;
            }
            r=r-2;
            c++;
            while(i<s.length() && r>=0){
                arr[r][c]=s.charAt(i);
                System.out.println(r+" "+c);
                i++;
                c++;
                r--;
            }
            c--;
            r=r+2;
        }
        String ans="";
        for(i=0;i<numRows;i++){
            for(int j=0;j<c+1;j++){
                if((arr[i][j]>='A' && arr[i][j]<='Z') || (arr[i][j]>='a' && arr[i][j]<='z') || arr[i][j]==',' || arr[i][j]=='.')
                     ans+=arr[i][j];
            }
        }
        return ans;
    }
}