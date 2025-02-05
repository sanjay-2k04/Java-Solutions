class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int tot =0;

        for(int n : nums)
        {
            if(tot < 0)
            {
                tot = 0;
            }
            tot = tot + n;
            res = Math.max(tot, res);
        }
        return res;
    }
}