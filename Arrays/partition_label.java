// https://leetcode.com/problems/partition-labels/
// 763. Partition Labels
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"], but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.

// Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

// Return a list of integers representing the size of these parts.

//code : 
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] lastind=new int[26];
        for(int i=0;i<s.length();i++){
            lastind[s.charAt(i)-'a']=i;
        }
        //last index or occurence stored
        int end=0,prev=0;
        for(int i=0;i<s.length();i++){
            end=Math.max(lastind[s.charAt(i)-'a'],end);
            //end=8
            if(i==end){
                list.add(end-prev+1);
                prev=end+1;
            }
        }
        return list;
    }
}