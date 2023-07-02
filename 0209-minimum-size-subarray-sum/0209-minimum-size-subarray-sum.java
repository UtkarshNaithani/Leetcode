class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int i=0,s=0,j=0;
        while(i<nums.length){
            s+=nums[i];
            if(s>=target){
                while(s>=target){
                    ans=Math.min(ans,i-j+1);
                    s-=nums[j];
                    j++;
                }
            }
            i++;
        }
        if(ans==Integer.MAX_VALUE) return 0;
        
        else return ans;
        
    }
}