import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]+ nums[i]==target){
                    return new int[]{i,j};
                }
            }
        }

        // No solution found
        return new int[] {};
    }
}
