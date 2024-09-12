import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();  // Corrected type
        ans.add(new ArrayList<>(Arrays.asList(strs[0])));  // Corrected for ArrayList

        for (int i = 1; i < strs.length; i++) {
            boolean added = false;
            for (int j = 0; j < ans.size(); j++) {
                if (isanagram(strs[i], ans.get(j).get(0))) {
                    ans.get(j).add(strs[i]);
                    added = true;
                    break;
                }
            }
            // If the string wasn't added to any group, create a new group
            if (!added) {
                ans.add(new ArrayList<>(Arrays.asList(strs[i])));  // Corrected here
            }
        }

        return ans;  // Added the missing return statement
    }

    public boolean isanagram(String a, String b) {
        if (a.length() != b.length()) return false;  // Early exit for different length strings

        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : a.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (char ch : b.toCharArray()) {
            if (!hm.containsKey(ch) || hm.get(ch) == 0) {
                return false;
            }
            hm.put(ch, hm.get(ch) - 1);
        }

        return true;  // If all counts are zero, they are anagrams
    }
}
