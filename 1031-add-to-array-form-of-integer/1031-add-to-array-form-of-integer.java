class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> a=new ArrayList<>();
        int i=num.length-1;
        int carry=0;
        while(i>=0||k>0)
        {
            int sum=carry;
            if(i>=0)
            {
                sum=sum+num[i--];
            }
            if(k>0)
            {
                sum=sum+k%10;
                k=k/10;
            }
            a.add(sum%10);
            carry=sum/10;
        }
            if(carry>0)
            {
                a.add(carry);
            }
            Collections.reverse(a);
            return a;
    }
}