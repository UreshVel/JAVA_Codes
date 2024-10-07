class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelscount=0;
        HashSet<Character> hs=new HashSet();
        for(char i:jewels.toCharArray())
        {
            hs.add(i);
        }
        for(char i:stones.toCharArray())
        {
            if(hs.contains(i))
            jewelscount++;
        }
        return jewelscount;
    }
}