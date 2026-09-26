class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int upper = 0;
        int lower = 0;
        for(int i =0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                upper ++;
            }
            else{
                lower++;
            }
            if(upper == word.length())
            {
                return true ;
            }
            if(lower == word.length())
            {
                return true ;
            }
            if(Character.isUpperCase(word.charAt(0))&&lower==word.length()-1)
            {
                return true;
            }
        }
        return false;
    }
}