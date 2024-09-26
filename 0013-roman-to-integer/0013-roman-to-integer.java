class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        a.put('I',1);
        a.put('V',5);
        a.put('X',10);
        a.put('L',50); 
        a.put('C',100);
        a.put('D',500);
        a.put('M',1000);
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 &&a.get(s.charAt(i))<a.get(s.charAt(i+1)))
            {
                res=res-(a.get(s.charAt(i)));
            }
            else
            {
                res=res+(a.get(s.charAt(i)));
            }
        }
        return res;
    }
}