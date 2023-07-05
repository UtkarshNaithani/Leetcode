/* 
    odd length subarray->(total subarray+1)/2
    
    even length subarray->(total subarray)/2
    
    total subarray for a particular element->left side subarray*right side subarray
    
    total subarray=(i+1)*(n-i)
    
    

*/
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
            
        for(int i=0;i<n;i++){
            
            int t=(i+1)*(n-i); //total subarray
            
            sum+= ((t+1)/2)*arr[i]; //for each element
        }
        return sum;
    }
}