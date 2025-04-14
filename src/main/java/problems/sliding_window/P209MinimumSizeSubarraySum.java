package problems.sliding_window;

public class P209MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;
        for(int right = 0; right < nums.length; right++) {
            currSum += nums[right];
            while(currSum >= target) {
                if(right - left + 1 < minLength) {
                    minLength = right - left + 1;
                }
                currSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
