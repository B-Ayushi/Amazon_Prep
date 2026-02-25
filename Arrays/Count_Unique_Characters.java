//https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/
//https://www.geeksforgeeks.org/count-unique-characters-of-all-substrings-of-a-given-string/
// 828. Count Unique Characters of All Substrings of a Given String
// Hard
// Topics
// premium lock icon
// Companies
// Let's define a function countUniqueChars(s) that returns the number of unique characters in s.

// For example, calling countUniqueChars(s) if s = "LEETCODE" then "L", "T", "C", "O", "D" are the unique characters since they appear only once in s, therefore countUniqueChars(s) = 5.
// Given a string s, return the sum of countUniqueChars(t) where t is a substring of s. The test cases are generated such that the answer fits in a 32-bit integer.

// Notice that some substrings can be repeated so in this case you have to count the repeated ones too.

 //substring or window count problem 
import java.util.ArrayList;
 class Solution {
    public int uniqueLetterString(String s) {
        int n=s.length();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<26;i++){
            list.get(i).add(-1);
        }
        //store alll the indices 
        for(int i=0;i<n;i++){
            list.get(s.charAt(i)-'A').add(i);
        }
        for(int i=0;i<26;i++){
            list.get(i).add(n);
        }

        long cnt=0;
        for(int i=0;i<26;i++){
            ArrayList<Integer> list1=list.get(i);
            for(int j=1;j<list1.size()-1;j++){
                cnt += (long)(list1.get(j) - list1.get(j - 1)) *  (list1.get(j + 1) - list1.get(j));
            }

        }
        return (int)cnt;

    }
}