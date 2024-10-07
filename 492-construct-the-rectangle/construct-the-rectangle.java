class Solution {
    public int[] constructRectangle(int area) {
        int s=(int)Math.sqrt(area);
        for(int i=s;i>=1;i--)
        {
            if(area%i==0)
            {
                return new int []{area/i,i};
            }
        }
        return new int[]{area,1};
    }
}