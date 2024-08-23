class Solution {
    public String largestOddNumber(String num) {
       for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            // Check if the current character is an odd digit
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                // Return the substring from the start to the current index (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
}