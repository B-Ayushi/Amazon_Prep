// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int idx=0;
        int n=nums.length;
        int left=1;
        for(int i=0;i<n;i++){
           res[i]=left;
           left*=nums[i];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }
}