class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(m,n,0,0,dp);
    }
    private int helper(int m2,int n2,int i,int j,int dp[][]){
        if(i==m2-1 && j==n2-1){
            dp[i][j]=1;
            return dp[i][j];
        }
        if(i>m2-1 || j>n2-1){
            dp[i][j]=0;
            return dp[i][j];
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
        int p1=helper(m2,n2,i+1,j,dp);
        int p2=helper(m2,n2,i,j+1,dp);
        dp[i][j]=p1+p2;
        return dp[i][j];
        
    }
}