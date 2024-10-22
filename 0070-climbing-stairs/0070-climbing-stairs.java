class Solution {

    private int backTrack(int n,int i,int[] dp){
        if(i<=0){
            return 1;
        }
        if(dp[i]!=-1) return dp[i];
        return dp[i]=backTrack(n,i-1,dp)+backTrack(n,i-2,dp);
    }

    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return backTrack(n,n-1,dp);
    }
}