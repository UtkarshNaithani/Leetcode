class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList();
        Arrays.sort(candidates);
        calc(candidates,0,new ArrayList(),ans,target);
        return ans;
    }
   private void calc(int[] nums,int si,List<Integer> curr,List<List<Integer>> ans,int target){
       
       if(target==0){
           ans.add(new ArrayList(curr));
         
       }
       if(target<0)
           return;
       for(int i=si;i<nums.length;i++){
           if(i>si && nums[i-1]==nums[i]) continue;
           curr.add(nums[i]);
           calc(nums,i+1,curr,ans,target-nums[i]);
           curr.remove(curr.size()-1);
       }
   }
}