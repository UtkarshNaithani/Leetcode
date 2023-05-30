class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList();
        Arrays.sort(nums);//[2,1,2] logic will fail 
        generate(0,nums,ans,new ArrayList());
        return ans;
    }
      private void generate(int ind,int[] nums,List<List<Integer>> ans,List<Integer> list){
        ans.add(new ArrayList(list)); 
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i-1]==nums[i]) continue;
            list.add(nums[i]);
            generate(i+1,nums,ans,list);
            list.remove(list.size()-1);
        }
    }
}