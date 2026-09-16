class Solution {
    public boolean checkInclusion(String s1, String s2)
     {
        int[] freq = new int[26];
        int [] wind = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i) - 'a']++;

        }
        int l =0;
        int r =0;
        while(r<s2.length())
        {
             wind[s2.charAt(r) - 'a']++;

             if(r-l+1>s1.length())
             {
                wind[s2.charAt(l) - 'a']--;
                l++;
             }
              if(r-l+1==s1.length())
             {
                if(Arrays.equals(freq , wind))
                {
                      return true;
                }
             }
             r++;

        }
return false;
    }
}