class Solution {
    public boolean detectCapitalUse(String word) {
        if(allupper(word)||alllower(word)||firstcaps(word))
        {
            return true;
        }
        return false;
    }
    private boolean allupper(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
            if(count==word.length())
            {
                return true;
            }
            return false;
        }
       private boolean alllower(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                count++;
            }
        }
            if(count==word.length())
            {
                return true;
            }
            return false;
        }
    private boolean firstcaps(String word)
    {
        char ch=word.charAt(0);
        String str=word.substring(1);
        if(Character.isUpperCase(ch)&&alllower(str))
        {
            return true;
        }
        return false;
    }
}