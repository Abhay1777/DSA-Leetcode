class Solution {
    public int search(int[] nums, int target)
     {
        int l = 0;
        int r = nums.length-1;
        int mid = l+(r-l)/2;
       while (l <= r)
       {
        if(target>nums[mid])
          {
          l = mid+1;
           mid = l+(r-l)/2;
          }
          else if (nums[mid]>target)
          {
           r = mid -1;
             mid = l+(r-l)/2;
          }
          else if (target ==nums[mid])
          {
            return mid;
          }
          } 
          return -1;

    }
}