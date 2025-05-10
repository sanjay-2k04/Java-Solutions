class Solution {
    public void rotate(int[] nums, int k) {
        
        
        // Create a temporary array to hold rotated values
        int[] temp = new int[nums.length];
        
        // Copy elements to rotated positions
        for (int i = 0; i < nums.length; i++) {
            int newPosition = (i + k) % nums.length;
            temp[newPosition] = nums[i];
        }
        
        // Copy back to original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}