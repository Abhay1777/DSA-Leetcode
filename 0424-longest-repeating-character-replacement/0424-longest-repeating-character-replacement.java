class Solution {
    public int characterReplacement(String s, int k)
     {
       int l = 0;
       int freq [] = new int[26];
       int maxfreq = 0;
       int maxLen =0;
       for(int i =0; i<s.length(); i++)
       {
        freq[s.charAt(i)-'A'] ++ ;
        maxfreq = Math.max(maxfreq , freq[s.charAt(i)-'A'] ) ; 
       
       while((i-l+1) - maxfreq >k)
       {
        freq[s.charAt(l)-'A']--;
        l++;
       }
       maxLen = Math.max(maxLen , i-l+1);
       }
       return maxLen;
    }
}