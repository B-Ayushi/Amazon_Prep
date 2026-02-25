
// https://leetcode.com/problems/most-common-word/
// 819. Most Common Word
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

// The words in paragraph are case-insensitive and the answer should be returned in lowercase.

// Note that words can not contain punctuation symbol

import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
         paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
         String[] words = paragraph.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String w:banned){
            set.add(w);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String w:words){
            if(set.contains(w)){
                continue;
            }
            map.put(w,map.getOrDefault(w,0)+1);
        }
        String res="";
        int max=0;
        for(String max1:map.keySet()){
            if(map.get(max1)>max){
                max=map.get(max1);
                res=max1;
            }
        }
        return res;
    }
}