class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List <Integer> result = new ArrayList<>();
       
       int[] freq = new int[26];
       int[] wind = new int [26];
       for(int i = 0;i<p.length();i++)
       {
         freq[p.charAt(i) - 'a']++;
       }
       int l = 0;
       int r = 0;

      while(r<s.length())
       {
      wind[s.charAt(r)-'a']++;

      if(r-l+1>p.length())
      {
        wind[s.charAt(l) - 'a']--;
        l++;
      }
      if(r-l+1==p.length())
      {
        if(Arrays.equals(freq , wind))
        {
            result.add(l);
        }
      }
        r++;
        }
        return result;
       }

    }
