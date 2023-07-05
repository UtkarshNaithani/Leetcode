class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int j=0,c=0,ans=0,odd=0,i=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                odd++;
                c=0; // didn't get the subarray
            }
            while(odd==k){
                c++;    //got the subarray
                if(nums[i++]%2!=0) // if element odd,sub odd got the sub-array,if not we have
                    // to consider that subarray also because it is forming a subarray
                odd--;
            }
            ans+=c;  //final count
            j++;
    }
    return ans;
}
}