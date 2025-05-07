class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        int cur=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            cur=Math.max(nums[i],nums[i]+cur);
            sum=Math.max(sum,cur);
        }
        return sum;
    }
}