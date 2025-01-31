class Solution {
    public boolean checkPerfectNumber(int num) {
         if (num <= 1) return false;
        int sum = 1; // 1 is a divisor for all numbers
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { // Avoid adding the square root twice
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}