class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(val!=nums[i])
            {
                count++;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(val!=nums[i])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return count;
    }
}

