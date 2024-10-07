class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelscount=0;
        HashSet<Character> hs=new HashSet();
        for(char i:jewels.toCharArray())
        {
            hs.add(i);
        }
        for(char j:stones.toCharArray())
        {
            if(hs.contains(j))
            jewelscount++;
        }
        return jewelscount;
    }
}