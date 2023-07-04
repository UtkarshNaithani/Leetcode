//Sliding Window
/* Approach
        ->sum of leftmost and rightmost element=x
        ->min. operation will happen when size of border is small meaning size of rest of ele is          large.
        ->sum of arrray-x=y
        ->find subarray of max length with sum y
    */
class Solution {
    public int minOperations(int[] nums, int x) {
        int s=0;
        for(int i=0;i<nums.length;i++)
            s+=nums[i];
        int target=s-x;
        
        //find the length of subarray having sum target with max length
        
      int curr=0,max=Integer.MIN_VALUE,i=0;
        boolean f=false;
        
        for(int j=0;j<nums.length;j++){
            curr+=nums[j];
            
                while(i<=j && curr>target){
                    curr-=nums[i];
                    i++;
                }
                
            
            if(curr==target){
                f=true;
                max=Math.max(max,j-i+1); //maxlength
            }
        }
        
        if(f){
            return nums.length-max;
        }
        
        else
            return -1;
        
        
        
        
    }
}