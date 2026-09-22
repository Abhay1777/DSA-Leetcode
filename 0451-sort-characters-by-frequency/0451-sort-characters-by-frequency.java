class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        for (int k = 0; k < 256; k++) {

            int max = 0;
            int index = -1;

            for (int i = 0; i < 256; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }
            if (max == 0) {
                break;
            }

            char ch = (char) index;

            for (int j = 0; j < max; j++) {
                result.append(ch);
            }

            freq[index] = 0;
        }

        return result.toString();
    }
}