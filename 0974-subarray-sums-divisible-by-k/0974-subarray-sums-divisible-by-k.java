//prefix sum approach O(N)->time,O(N)->Space
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int ps=0;
        map.put(0,1); //When remainder 0 freq. 1
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int rem=ps%k; //calc remainder
            if(rem<0) rem+=k;
            
            if(map.containsKey(rem)){
                ans+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
                
            
            else
                map.put(rem,1);
                
        }
        return ans;
    }
}