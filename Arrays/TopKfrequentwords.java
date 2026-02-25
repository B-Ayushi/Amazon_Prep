// https://leetcode.com/problems/top-k-frequent-words/
// 692. Top K Frequent Words
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an array of strings words and an integer k, return the k most frequent strings.

// Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < k; i++) {

            int max = Integer.MIN_VALUE;
            String maxWord = "";

            for (String word : map.keySet()) {

                if (map.get(word) > max) {
                    max = map.get(word);
                    maxWord = word;
                }
                 else if (map.get(word) == max &&
                         word.compareTo(maxWord) < 0) {
                    // lexicographically smaller
                    maxWord = word;
                }
            }

            list.add(maxWord);
            map.remove(maxWord);  // remove AFTER scanning
        }

        return list;
    }
}