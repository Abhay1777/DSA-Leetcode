class Solution {
    public int[] runningSum(int[] nums)
     {
        int[] sum = new int[nums.length];
        int run = 0;
        
        for(int i =0; i<nums.length;i++)
        {
        run=run + nums[i];
        sum[i]=run;
        }
            return sum;

        }
        
    }
