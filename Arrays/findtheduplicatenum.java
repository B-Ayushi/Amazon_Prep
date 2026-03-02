// https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       int res=0;
       for(int key:map.keySet()){
        if(map.get(key)>1){
            res=key;
            break;
        }
       }
       return res;
    }
}
