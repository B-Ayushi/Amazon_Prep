//Using priority queue to store the top k elements based on their frequency
//https://leetcode.com/problems/top-k-frequent-words/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
HashMap<String,Integer>map=new HashMap<>();
for(String str:words){
    map.put(str,map.getOrDefault(str,0)+1);
}
PriorityQueue<String> pq=new PriorityQueue<>((a,b) -> {
    if(map.get(a)==map.get(b)){
        return b.compareTo(a);

    }
    return map.get(b)-map.get(a);
}); 
  pq.addAll(map.keySet());
    List<String> list=new ArrayList<>();
    for(int i=0;i<k;i++){
        list.add(pq.poll());
    }
    return list;
    }   }