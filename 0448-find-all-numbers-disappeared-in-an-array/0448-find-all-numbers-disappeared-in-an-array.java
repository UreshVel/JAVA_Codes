class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] a=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            a[nums[i]-1]=true;
        }
        List<Integer> b=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(!a[i])
            {
                b.add(i+1);
            }
        }
        return b;
    }
}