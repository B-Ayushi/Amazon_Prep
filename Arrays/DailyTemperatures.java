class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            int current = temperatures[i];  // keep this constant

            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > current) {
                    res[i] = j - i;
                    break;   // stop once warmer day found
                }
            }
        }

        return res;
    }
}