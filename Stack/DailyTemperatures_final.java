// // // Monotonic Decreasing Stack approach.
// // https://leetcode.com/problems/daily-temperatures/
// 739. Daily Temperatures
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int n = temperatures.length;

        Stack<Integer> stack = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            
            // If current temperature is greater than stack top index temperature
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            
            stack.push(i);
        }

        return res;
    }
}