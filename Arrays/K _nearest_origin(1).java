// https://leetcode.com/problems/k-closest-points-to-origin/
// 973. K Closest Points to Origin
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

// The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).

// You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).


//This gave a tle but the approach is correct
import java.util.HashMap;
 class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<int[], Integer> map = new HashMap<>();
        //calculate euclidean distance
        for(int i=0;i<points.length;i++){
             int dist = points[i][0] * points[i][0] +
                       points[i][1] * points[i][1];

            map.put(points[i], dist);
        }
        
        int res[][]=new int[k][2];
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int []close=null;
            for(int pt[]:map.keySet()){
                if(map.get(pt)<min){
                    min=map.get(pt);
                    close=pt;
                }
            }
            res[i]=close;
            map.remove(close);
        }
        return res;
    }
}