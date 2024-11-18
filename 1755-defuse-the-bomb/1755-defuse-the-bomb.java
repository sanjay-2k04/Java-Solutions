class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n]; // Store the result in a new array
        
        if (k > 0) {
            // When k is positive, sum the next k elements (with wrapping)
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n]; // Wrap around using modulo
                }
                result[i] = sum;
            }
        } else if (k < 0) {
            // When k is negative, sum the previous |k| elements (with wrapping)
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n]; // Wrap around using modulo
                }
                result[i] = sum;
            }
        } else {
            // When k is 0, all elements should be 0
            for (int i = 0; i < n; i++) {
                result[i] = 0;
            }
        }
        
        return result; // Return the new result array
    }
}
