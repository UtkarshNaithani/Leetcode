class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        
        int ctr=1,max=1;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]) continue;
            if(nums[i]+1==nums[i+1]){
                ctr++;
                max=Math.max(max,ctr);
            }
            
            else
                ctr=1;
            
        }
        return max;
        
    }
}