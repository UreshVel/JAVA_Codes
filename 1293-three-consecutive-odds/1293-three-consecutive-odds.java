class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consecutiveodds=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                consecutiveodds++;
            if(consecutiveodds>=3)
            {
                return true;
            }
            }
            else
            {
                consecutiveodds=0;
            }
        }
        return false;
    }
}