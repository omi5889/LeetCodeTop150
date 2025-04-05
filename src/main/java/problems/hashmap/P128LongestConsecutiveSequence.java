package problems.hashmap;

import java.util.HashSet;
import java.util.Set;

public class P128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }
        return ans;
    }
}

