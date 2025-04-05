package problems.arrays_strings;

public class P042TrappingRainWater {
    public int trap(int[] height) {
        int water = 0;
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        while (left < right) {
            if(leftMax < rightMax) {
                left += 1;
                leftMax = Math.max(leftMax,height[left]);
                water += leftMax - height[left];
            } else {
                right -= 1;
                rightMax = Math.max(rightMax,height[right]);
                water += rightMax - height[right];
            }
        }
        return water;
    }
}
