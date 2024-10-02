class Solution {
    public int reverse(int x) {
        long reversed=0;
        int pop;
        while(x!=0)
        {
            pop=x%10;
            x/=10;
            reversed=(reversed*10)+pop;
            if(reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE)
            {
                return 0;
            }
        }
        return (int)reversed;
    }
}