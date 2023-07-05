class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length==1) return 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                nums[i]=-1; //0 to -1,then the problem will become to calc. largest length of sub-array with sum 0 b.coz 1 + (-1)=0
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        int s=0,ans=0;
        
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            
            if(map.containsKey(s)){
                int l=map.get(s);
                ans=Math.max(ans,i-l);
            }
            else{
                map.put(s,i);
            }
        }
        return ans;
    }
}