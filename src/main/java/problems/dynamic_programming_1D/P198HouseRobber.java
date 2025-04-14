package problems.dynamic_programming_1D;

public class P198HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int prevMax = 0, currMax = 0;
        for (int num : nums) {
            int temp = currMax;
            currMax = Math.max(num + prevMax, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
