//Prefix sum Approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1); //for psum 0 value=1
        
        int s=0,res=0;
        
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            
            if(map.containsKey(s-k)){
                res+=map.get(s-k);
            }
            
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        return res;
        
    }
}