class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int l =0 ;
        for(int r=1;r<nums.length;r++)
        {
            if(nums[r]!=nums[l])
            {
                l++;
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
             
            }   

        }
        return l+1;
    }
}