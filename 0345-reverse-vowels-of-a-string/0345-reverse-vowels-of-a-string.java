class Solution {
    public String reverseVowels(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        char[] chars = s.toCharArray(); 

        String vowels = "aeiouAEIOU"; 

        while (p1 < p2) {
            if (vowels.indexOf(chars[p1]) == -1) {
                p1++;
                continue;
            }

         
            if (vowels.indexOf(chars[p2]) == -1) {
                p2--;
                continue;
            }

            char temp = chars[p1];
            chars[p1] = chars[p2];
            chars[p2] = temp;

            p1++;
            p2--;
        }

        return new String(chars);
    }
}