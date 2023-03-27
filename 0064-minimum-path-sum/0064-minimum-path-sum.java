class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length+1][grid[0].length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
       return helper(grid,0,0,0,dp);
    }
    private int helper(int[][] grid,int i,int j,int s,int dp[][]){
        if(i==grid.length-1 && j==grid[0].length-1){
            dp[i][j]=grid[i][j];
            return dp[i][j];
        }
        if(i>grid.length-1 || j>grid[0].length-1){
            dp[i][j]=Integer.MAX_VALUE;
            return dp[i][j];
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
            
        
        int op1=helper(grid,i+1,j,s,dp);
        int op2=helper(grid,i,j+1,s,dp);
        dp[i][j]= grid[i][j]+Math.min(op1,op2);
        return dp[i][j];
    }
}