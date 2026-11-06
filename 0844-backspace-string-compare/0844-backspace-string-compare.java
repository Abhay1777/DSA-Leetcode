class Solution {
    public boolean backspaceCompare(String s, String t)
     {
        Stack<Character>st = new Stack<>();
        for(int i = 0; i<s.length();i++)
        {
        char ch = s.charAt(i);
        if(ch == '#')
        {
        if(!st.isEmpty())
        {
            st.pop();
        }
        }
        else 
        {
            st.push(ch);
        }
        
        }

         Stack<Character>st2 = new Stack<>();
         for(int i = 0; i<t.length();i++)
         {
        char ch1 = t.charAt(i);
        if(ch1 == '#')
        {
        if(!st2.isEmpty())
        {
            st2.pop();
        }
        }
        else 
        {
            st2.push(ch1);
        }
         }
         

       return st.equals(st2);
        
    }
}