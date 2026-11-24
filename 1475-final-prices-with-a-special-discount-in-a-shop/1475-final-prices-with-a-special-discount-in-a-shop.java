class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> st = new Stack<>();
        int[] ans = prices.clone();

        for (int i = 0; i < prices.length; i++) {

            while (!st.isEmpty() && prices[i] <= prices[st.peek()]) {

                int prev = st.pop();
                ans[prev] = prices[prev] - prices[i];
            }

            st.push(i);
        }

        return ans;
    }
}