class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String c=s+s;
        if(c.contains(goal)) return true;
        return false;
    }
}