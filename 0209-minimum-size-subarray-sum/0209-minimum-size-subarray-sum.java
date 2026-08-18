class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l = 0;
        int r = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (r < nums.length) 
        {
            sum += nums[r];
            while (sum >= target) {

                int length = r - l + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum -= nums[l];
                l++;
            }
            r++;
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}