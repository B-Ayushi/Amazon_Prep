// User function Template for Java
// https://www.geeksforgeeks.org/problems/type-of-array4605/1?page=1&company=Amazon&sortBy=difficulty
// You are given an array arr[] having unique elements. Your task is to return the type of array.
// Note: The array can be categorized into ascending, descending, descending rotated and ascending rotated followed by:

// Return 1 if the array is in ascending order
// Return 2 if the array is in descending order
// Return 3 if the array is in descending rotated order
// Return 4 if the array is in ascending rotated order
class Solution {
    int maxNtype(int arr[]) {
        // code here
        int n=arr.length;
        //break in 3&4 there will  be one break 
        if(n<=1){
            return 1;
        }
       int inc=0;
       int dec=0;
       
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                inc++;
            }
            else if(arr[i-1]>arr[i]){
                dec++;
            }
        }
        if(inc==n-1){
            return 1;
        }
        if(dec==n-1){
            return 2;
        }
        boolean up=false;
        boolean down=false;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                up=true;
                
            }
             else if (arr[i - 1] > arr[i]) {
                down = true;
            }
        }
        if(up&&down){
            if(arr[0]>arr[n-1]){
                return 4;
            }
            else{
                return 3;
            }
        }
        return 0;
    }
}
