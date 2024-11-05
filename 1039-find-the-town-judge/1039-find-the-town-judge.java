class Solution {
    public int findJudge(int n, int[][] trust) {
        int []trustcount=new int[n+1];
        int []trustby=new int[n+1];
        for(int []tr:trust)
        {
            int a=tr[0];
            int b=tr[1];
            trustcount[b]++;
            trustby[a]++;
        }
        int townjudge=-1;
        for(int i=0;i<=n;i++)
        {
            if(trustcount[i]==n-1 && trustby[i]==0)
            {
                townjudge=i;
            }
        }
        return townjudge;
    }
}