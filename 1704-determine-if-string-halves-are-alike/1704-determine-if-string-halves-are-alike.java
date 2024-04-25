class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String a=s.substring(0,n/2);
        String b=s.substring(n/2,n);
        int c1=0,c2=0;
        for(int i=0;i<n/2;i++){
            char a1=a.charAt(i);
            char b1=b.charAt(i);
            if(a1=='a'||a1=='e'||a1=='i'||a1=='o'||a1=='u'||a1=='A'||a1=='E'||a1=='I'||a1=='O'||a1=='U'){
                c1++;
            }
            if(b1=='a'||b1=='e'||b1=='i'||b1=='o'||b1=='u'||b1=='A'||b1=='E'||b1=='I'||b1=='O'||b1=='U'){
                c2++;
            }
        }
        if(c1==c2){
            return true;
        }
        return false;
    }
}