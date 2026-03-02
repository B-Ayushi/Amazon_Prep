// // https://leetcode.com/problems/third-maximum-number/description/


// 414. Third Maximum Number
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

class Solution {
    public int thirdMax(int[] nums) {
      
             HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
        set.add(num);

       }
       
int[] result = new int[set.size()];
int i = 0;

for (int num : set) {
    result[i++] = num;
}
  Arrays.sort(result);
        if(result.length<3){
            return result[result.length-1];

        }   
        int n=result.length;
          return result[n - 3];
         }
}