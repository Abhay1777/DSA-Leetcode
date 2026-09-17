class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
     {
        int[] freq = new int[26];
        for(int i =0;i<magazine.length();i++)
        {
            freq[ magazine.charAt(i) - 'a']++;
        }

         for(int k = 0; k<ransomNote.length(); k++)
         {
            freq[ransomNote.charAt(k) - 'a'] --;
            if (freq[ransomNote.charAt(k) - 'a'] < 0)
            {
            return false;   
        }

         }
       
           return true;
    }
}