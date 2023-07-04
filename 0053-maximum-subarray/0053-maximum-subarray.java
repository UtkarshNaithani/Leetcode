//Kadane Algorithm,TC->O(N)
class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0; //current sum
        int ms=Integer.MIN_VALUE; //max sum
        
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            ms=Math.max(cs,ms);
            if(cs<0) cs=0; //If current sum is -ve do not consider it
        }
        return ms;
    }
}