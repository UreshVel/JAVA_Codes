class Solution {
    public int singleNumber(int[] nums) {
        int u=0;
        for(int i=0;i<nums.length;i++)
        {
            u=u^nums[i];
        }
        return u;
    }
}