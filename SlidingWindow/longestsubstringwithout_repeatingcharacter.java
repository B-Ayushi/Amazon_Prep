// //Longest substring without repeating characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
           HashSet<Character> set=new HashSet<>();
           int n=s.length();
           if(n==0){
            return 0;
           }
           int max=0;
           int i=0,j=0;
           while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i+1);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
           }
           return max-1;  
    }
}



