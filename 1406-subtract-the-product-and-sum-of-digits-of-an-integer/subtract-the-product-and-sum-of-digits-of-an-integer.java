class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n>0)
        {
            int l=n%10;
            p*=l;
            s+=l;
            n=n/10;
        }
        int result=p-s;
        return result;
    }
}