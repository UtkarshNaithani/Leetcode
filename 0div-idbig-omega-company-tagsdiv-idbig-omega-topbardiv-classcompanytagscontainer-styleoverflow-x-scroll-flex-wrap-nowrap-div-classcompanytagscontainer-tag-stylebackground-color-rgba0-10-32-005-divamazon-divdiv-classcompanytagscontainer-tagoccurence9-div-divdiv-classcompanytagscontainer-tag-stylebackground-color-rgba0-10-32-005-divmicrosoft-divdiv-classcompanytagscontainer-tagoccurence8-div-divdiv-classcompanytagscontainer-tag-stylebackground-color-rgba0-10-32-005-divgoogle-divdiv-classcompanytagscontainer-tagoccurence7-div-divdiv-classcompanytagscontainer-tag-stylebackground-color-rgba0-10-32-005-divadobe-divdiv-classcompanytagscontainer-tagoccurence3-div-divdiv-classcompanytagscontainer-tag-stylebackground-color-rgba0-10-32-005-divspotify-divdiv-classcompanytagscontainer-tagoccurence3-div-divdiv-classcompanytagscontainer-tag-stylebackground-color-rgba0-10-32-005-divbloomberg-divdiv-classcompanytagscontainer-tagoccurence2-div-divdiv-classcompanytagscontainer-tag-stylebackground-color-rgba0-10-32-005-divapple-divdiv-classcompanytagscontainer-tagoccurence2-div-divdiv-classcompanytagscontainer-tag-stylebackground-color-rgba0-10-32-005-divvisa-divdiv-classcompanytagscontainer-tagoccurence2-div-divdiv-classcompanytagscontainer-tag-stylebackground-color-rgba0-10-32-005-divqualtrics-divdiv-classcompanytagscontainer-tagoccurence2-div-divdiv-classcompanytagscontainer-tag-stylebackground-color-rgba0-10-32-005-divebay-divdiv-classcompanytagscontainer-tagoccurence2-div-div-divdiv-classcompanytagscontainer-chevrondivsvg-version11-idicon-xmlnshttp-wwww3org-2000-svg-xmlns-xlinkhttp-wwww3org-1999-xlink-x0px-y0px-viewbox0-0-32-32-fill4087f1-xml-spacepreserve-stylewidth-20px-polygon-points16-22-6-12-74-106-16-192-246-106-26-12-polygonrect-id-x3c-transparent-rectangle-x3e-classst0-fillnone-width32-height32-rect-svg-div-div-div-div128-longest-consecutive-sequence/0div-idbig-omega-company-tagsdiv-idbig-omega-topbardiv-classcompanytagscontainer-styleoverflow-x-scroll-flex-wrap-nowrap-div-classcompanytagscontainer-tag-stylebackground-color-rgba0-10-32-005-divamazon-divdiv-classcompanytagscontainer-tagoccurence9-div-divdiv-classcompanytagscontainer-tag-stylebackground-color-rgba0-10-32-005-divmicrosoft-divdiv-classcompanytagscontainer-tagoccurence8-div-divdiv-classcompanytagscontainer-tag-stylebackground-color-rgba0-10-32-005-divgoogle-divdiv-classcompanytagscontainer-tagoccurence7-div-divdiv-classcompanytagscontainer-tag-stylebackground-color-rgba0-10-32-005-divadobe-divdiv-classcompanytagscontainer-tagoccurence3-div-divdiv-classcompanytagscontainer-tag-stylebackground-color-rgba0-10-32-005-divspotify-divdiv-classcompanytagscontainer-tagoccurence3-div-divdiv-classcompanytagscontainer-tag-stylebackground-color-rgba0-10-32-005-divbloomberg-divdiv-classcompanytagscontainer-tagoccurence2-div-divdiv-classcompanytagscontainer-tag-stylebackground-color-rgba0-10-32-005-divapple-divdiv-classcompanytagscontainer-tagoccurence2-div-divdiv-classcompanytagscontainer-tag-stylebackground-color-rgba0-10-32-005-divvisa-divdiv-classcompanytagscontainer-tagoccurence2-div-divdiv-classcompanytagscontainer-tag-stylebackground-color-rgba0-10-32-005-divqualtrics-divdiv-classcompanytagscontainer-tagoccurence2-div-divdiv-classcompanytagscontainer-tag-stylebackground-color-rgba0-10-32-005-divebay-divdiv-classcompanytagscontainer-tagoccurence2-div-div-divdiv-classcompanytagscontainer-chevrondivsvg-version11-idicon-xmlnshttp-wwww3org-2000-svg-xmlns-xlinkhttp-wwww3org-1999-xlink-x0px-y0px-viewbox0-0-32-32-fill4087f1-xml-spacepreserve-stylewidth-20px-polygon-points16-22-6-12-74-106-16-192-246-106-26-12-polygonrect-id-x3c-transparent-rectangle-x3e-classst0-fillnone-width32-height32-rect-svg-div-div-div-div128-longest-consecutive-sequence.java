class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
         if(nums.length==1) return 1;
        
        HashSet<Integer> set=new HashSet<>(); //only takes unique elements
        
        int res=0;
        
        for(int i:nums)
            set.add(i);
        
            for(int i:nums){
                
                int max=1, prev=i-1,next=i+1;
                
                while(set.contains(prev)){
                   max++;
                set.remove(prev);
                prev=prev-1;
                    
                }
                
                while(set.contains(next)){
                    max++;
                    set.remove(next);
                    next=next+1;
                }
                
                res=Math.max(res,max);
                
            }
        return res;
    }
}