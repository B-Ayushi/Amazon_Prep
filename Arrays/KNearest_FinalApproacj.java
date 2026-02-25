// https://leetcode./problems/k-closest-points-to-origin/
//not giving tle but the approach is correct we use array comparator to sort the points based on their distance from origin and then return the first k points


import java.util.Arrays;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
       int[][]res=new int[k][2];
       Arrays.sort(points,(a,b) ->
       (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1])
       );
       for(int i=0;i<k;i++){
        res[i]=points[i];
       }
       return res;
    }
}