class Solution {
    public int calPoints(String[] operations)
     {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i <operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
                st.pop();
            }
            else if(operations[i].equals("D"))
            {
               int val = st.peek()*2;
               st.push(val);
            }
            else if (operations[i].equals("+"))
            {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b);
            }
            else
            {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty())
        {
            sum = sum + st.pop();
        }
        return sum;
    }
}