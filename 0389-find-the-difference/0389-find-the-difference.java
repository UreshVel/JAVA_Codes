class Solution {
    public char findTheDifference(String s, String t) {
        char r=0;
        for(char a:s.toCharArray())
        {
            r^=a;
        }
        for(char b:t.toCharArray())
        {
            r^=b;
        }
        return r;
    }
}