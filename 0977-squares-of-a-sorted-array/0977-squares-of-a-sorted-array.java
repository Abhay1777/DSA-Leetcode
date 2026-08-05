class Solution {
    public int[] sortedSquares(int[] nums)
     {
        int sqr = 0;
        int [] arr = new int[nums.length];
           
        for(int i =0; i<nums.length;i++)
        {
               sqr = nums[i]*nums[i];
               
                arr[i]=sqr;
                
        }
       Arrays.sort(arr);
        return arr;
    }
}