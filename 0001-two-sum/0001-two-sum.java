class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int i=0,j=arr.length-1,x=0,y=0;
        while(i<j){
           if(arr[i]+arr[j]>target)
               j--;
         else if(arr[i]+arr[j]<target)
             i++;
            else{
                x=arr[i];
                y=arr[j];
                break;
            }
        }
        int ans[]=new int[2];
        int k=0;
        for(int t=0;t<nums.length;t++){
           if(nums[t]==x || nums[t]==y)
               ans[k++]=t;
               
     
        }
        return ans;
    }
}