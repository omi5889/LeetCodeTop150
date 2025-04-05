package problems.arrays_strings;

public class P169MajorityElement {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        if(nums.length == 1) return nums[0];
        for(int num:nums) {
            if(count == 0) {
                result = num;
            }
            if(num == result) count++;
            else count--;
        }
        return result;
    }
}
