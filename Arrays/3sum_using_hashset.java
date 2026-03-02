// https://leetcode.com/problems/3sum/
//using hashset 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> resSet = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int a = nums[i];
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int b = nums[j];
                int c = -a - b;

                if (set.contains(c)) {
                    List<Integer> triplet = Arrays.asList(a, b, c);
                    Collections.sort(triplet); // so [0, -1, 1] = [-1, 0, 1]
                    resSet.add(triplet);       // Set handles duplicate removal
                }

                set.add(b);
            }
        }

        return new ArrayList<>(resSet); // Convert Set to List before returning

    }
}
