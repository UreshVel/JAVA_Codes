class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int nums:nums1)
        a.add(nums);
        for(int nums:nums2)
        b.add(nums);
        a.retainAll(b);
        int arr[]=new int[a.size()];
        int i=0;
        for(int num:a)
        {
            arr[i]=num;
            i++;
        }
        return arr;

    }
}