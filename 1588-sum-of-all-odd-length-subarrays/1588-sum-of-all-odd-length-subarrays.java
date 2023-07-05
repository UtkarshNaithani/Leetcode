class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if((j-i+1)%2!=0)
                    s+=calc(arr,i,j);
            }
        }
        return s;
    }
    
    private int calc(int arr[],int i,int j){
        int s=0;
        
        for(int t=i;t<=j;t++)
            s+=arr[t];
        
        return s;
    }
}