class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }
    private void helper(int[] nums,int si,List<List<Integer>> ans,List<Integer> list){
        if(si==nums.length){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        //pick
        helper(nums,si+1,ans,list);
        list.add(nums[si]);

        //not pick
        helper(nums,si+1,ans,list);
        list.remove(list.size()-1);
    }
}