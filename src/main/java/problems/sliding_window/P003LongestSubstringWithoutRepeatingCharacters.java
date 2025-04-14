package problems.sliding_window;

import java.util.HashSet;

public class P003LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        if(s.isEmpty()) return 0;
        if(s.length() == 1) return s.length();
        int left = 0, right;
        HashSet<Character> set = new HashSet<>();
        for(right = 0; right < s.length(); right++) {
            if(set.contains(s.charAt(right))) {
                while(set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
