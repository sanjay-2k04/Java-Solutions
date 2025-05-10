class Solution {
    public void rotate(int[] nums, int k) {
        // Handle edge cases
        
        // Normalize k in case it's larger than array length
        k = k % nums.length;
        
        if (k == 0) {
            return; // No rotation needed
        }
        
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