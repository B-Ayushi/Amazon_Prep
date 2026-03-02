// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        //two pointer approach
        
        int left=0;
        int right=n-1;
        int max=0;
    while(left<=right){
        int width=right-left;
        int area=(Math.min(height[left],height[right]))*width;
        max=Math.max(area,max);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
    }
    return max;
    }
}