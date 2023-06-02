class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList();
        calc(candidates,0,new ArrayList(),ans,target);
        return ans;
    }
    private void calc(int[] nums,int si,ArrayList<Integer> curr,List<List<Integer>> ans,int target){
        if(target==0){
            ans.add(new ArrayList(curr));
            
        }
        if(target<0)
            return;
        
        for(int i=si;i<nums.length;i++){
            curr.add(nums[i]);
            calc(nums,i,curr,ans,target-nums[i]);
            curr.remove(curr.size()-1);
        }
    }
}