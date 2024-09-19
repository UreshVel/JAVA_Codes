class Solution {
    public int maxSubArray(int[] nums) {
        int csum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int a=csum+nums[i];
            if(a<nums[i])
            {
                csum=nums[i];
            }
            else
            {
                csum=a;
            }
            if(csum>maxsum)
            {
                maxsum=csum;
            }
        }
        return maxsum;
    }
}